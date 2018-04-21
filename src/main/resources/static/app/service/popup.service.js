angular
    .module('demoApp')
    .factory('popupService', popupService);

function popupService($mdDialog) {
    var service = {};

    service.openCreateNewGoodPopup = openCreateNewGoodPopup;
    service.openExportGoodPopup = openExportGoodPopup;
    return service;

    function openCreateNewGoodPopup() {
        var template = '<create-new-good></create-new-good>';
        createPopup(template);
    }
    
    function openExportGoodPopup() {
        var template = '<export-good></export-good>';
        createPopup(template);
    }

    function createPopup(template, confirmCallback, cancelCallback, clickOutsideToClose) {
        $mdDialog.show({
            template: template,
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