angular
    .module('demoApp')
    .factory('popupService', popupService);

function popupService($mdDialog) {
    var service = {};

    service.openCreateNewGoodPopup = openCreateNewGoodPopup;
    service.openExportGoodPopup = openExportGoodPopup;
    service.openImportGoodPopup = openImportGoodPopup;
    service.openCreateNewGoodTypePopup = openCreateNewGoodTypePopup;
    service.openCreateProviderPopup = openCreateProviderPopup;
    return service;

    function openCreateNewGoodPopup() {
        var template = '<create-new-good></create-new-good>';
        createPopup(template);
    }
    
    function openExportGoodPopup() {
        var template = '<export-good></export-good>';
        createPopup(template);
    }

    function openImportGoodPopup() {
        var template = '<import-good></import-good>';
        createPopup(template);
    }

    function openCreateNewGoodTypePopup() {
        var template = '<create-new-good-type></create-new-good-type>';
        var multiple = true;
        createPopup(template, multiple);
    }

    function openCreateProviderPopup() {
        var template = '<create-provider></create-provider>';
        var multiple = true;
        createPopup(template, multiple);
    }

    function createPopup(template, multiple, confirmCallback, cancelCallback, clickOutsideToClose) {
        $mdDialog.show({
            template: template,
            multiple: multiple,
            clickOutsideToClose: clickOutsideToClose
        }).then(() => {
            if (confirmCallback) {
                confirmCallback();
            }
        }, () => {
            if (cancelCallback) {
                cancelCallback();
            }
        });
    }
};