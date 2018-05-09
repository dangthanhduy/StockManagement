angular
    .module('demoApp')
    .factory('popupService', popupService);

var newGoodType = '';
function popupService($mdDialog) {
    var service = {};
    
    service.openCreateNewGoodPopup = openCreateNewGoodPopup;
    service.openExportGoodPopup = openExportGoodPopup;
    service.openImportGoodPopup = openImportGoodPopup;
    service.openCreateNewGoodTypePopup = openCreateNewGoodTypePopup;
    service.openCreateProviderPopup = openCreateProviderPopup;
    service.reloadProvider = reloadProvider;
    service.reloadUnit = reloadUnit;
    service.reloadGoodType = reloadGoodType;
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
    
    function reloadProvider() {
    	alert("Reload provider");
    }
    
    function reloadUnit() {
    	alert("Reload unit");
    }
    
    function reloadGoodType(response) {
    	alert(goodType);
    	newGoodType = goodType;
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