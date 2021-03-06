import AutoSave from 'source/util/AutoSave.es';
import {dom} from 'metal-dom';

const AUTOSAVE_INTERVAL = 2;

const URL = '/sample/autosave';

const createForm = () => {
	dom.enterDocument('<form id="mockForm"></form>');

	return document.querySelector('#mockForm');
};

const createInput = id => {
	dom.enterDocument(`<input id="${id}" value="0" />`);

	return document.querySelector(`#${id}`);
};

describe(
	'AutoSave',
	() => {
		let component;
		let form;
		let stateSyncronizer;

		afterEach(
			() => {
				if (component) {
					component.dispose();
				}
				if (form) {
					dom.exitDocument(form);
				}
			}
		);

		beforeEach(
			() => {
				jest.useFakeTimers();
				fetch.resetMocks();

				form = createForm();

				stateSyncronizer = {
					getState: () => {
						return {
							pages: stateSyncronizer.pages
						};
					},
					'isEmpty': () => true,
					pages: [],
					syncInputs: () => {}
				};

				component = new AutoSave(
					{
						form,
						interval: AUTOSAVE_INTERVAL,
						namespace: '',
						stateSyncronizer,
						url: URL
					}
				);
			}
		);

		it(
			'should call the saveIfNeeded function every given interval',
			() => {
				const saveIfNeededMock = jest.spyOn(component, 'saveIfNeeded');

				saveIfNeededMock.mockImplementation(() => null);

				jest.advanceTimersByTime(component.props.interval * 3);

				expect(saveIfNeededMock).toHaveBeenCalledTimes(3);

				saveIfNeededMock.mockRestore();
			}
		);

		it(
			'should call save function only once when time has passed but state has not changed',
			() => {
				const saveSpy = jest.spyOn(component, 'save');

				stateSyncronizer.getState = () => {
					return {
						newState: true
					};
				};
				stateSyncronizer.isEmpty = () => false;

				fetch.mockResponse(
					JSON.stringify({}),
					{
						status: 200
					}
				);

				jest.advanceTimersByTime(component.props.interval * 3);

				expect(saveSpy).toHaveBeenCalledTimes(1);

				saveSpy.mockRestore();
			}
		);

		it(
			'should save current state hash if request is successful',
			() => {
				const spy = jest.spyOn(component, 'saveStateHash');

				const modifiedDate = 'date-1';
				const saveAsDraft = component.props.saveAsDraft;

				fetch.mockResponse(
					JSON.stringify(
						{
							modifiedDate,
							saveAsDraft
						}
					)
				);

				return component.save().then(() => expect(spy).toHaveBeenCalledTimes(1));
			}
		);

		it(
			'should reload the page when session has expired',
			() => {
				const reloadMock = jest.spyOn(window.location, 'reload');

				reloadMock.mockImplementation(() => null);

				fetch.mockReject({status: 401});

				return component.save().catch(
					() => {
						expect(reloadMock).toHaveBeenCalledTimes(1);
						reloadMock.mockRestore();
					}
				);
			}
		);

		it(
			'should not reload the page when request failed for other reasons',
			() => {
				const reloadMock = jest.spyOn(window.location, 'reload');

				reloadMock.mockImplementation(() => null);

				fetch.mockReject({status: 500});

				return component.save().catch(
					() => {
						expect(reloadMock).not.toHaveBeenCalled();
						reloadMock.mockRestore();
					}
				);
			}
		);

		it(
			'should emit the "autosaved" event if request is successful',
			() => {
				const spy = jest.spyOn(component, 'emit');

				const modifiedDate = 'date-1';
				const saveAsDraft = component.props.saveAsDraft;

				fetch.mockResponse(
					JSON.stringify(
						{
							modifiedDate,
							saveAsDraft
						}
					)
				);

				return component.save().then(
					() => {
						expect(spy).toHaveBeenCalledWith(
							'autosaved',
							{
								modifiedDate,
								savedAsDraft: saveAsDraft
							}
						);
					}
				);
			}
		);

		it(
			'should define input ids after form is saved for the first time',
			() => {
				const ddmStructureIdInput = createInput('ddmStructureId');
				const formInstanceIdInput = createInput('formInstanceId');

				fetch.mockResponse(
					JSON.stringify(
						{
							ddmStructureId: 456,
							formInstanceId: '123'
						}
					)
				);

				return component.save().then(
					() => {
						expect(ddmStructureIdInput.value).toBe('456');
						expect(formInstanceIdInput.value).toBe('123');

						dom.exitDocument(formInstanceIdInput);
						dom.exitDocument(ddmStructureIdInput);
					}
				);
			}
		);
	}
);