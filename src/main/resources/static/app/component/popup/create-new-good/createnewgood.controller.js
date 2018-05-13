appComponent.controller('createNewGoodController', function ($scope, $http, $mdDialog, popupService) {
    var newgood = {};
    var host = 
    $http.get(`/loadprovidergoodtype`)
        .then(function successCallback(response) {
            $scope.listProvider = response.data.listProviderName;
            $scope.listGoodType = response.data.listGoodTypeName;
            $scope.listUnitType = response.data.listUnitType;
        }, function errorCallback(response) {
            alert("Error.....");
        });

    $scope.save = function () {

        var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'text/plain'
            }
        };
        newgood = {
            code: $scope.code,
            unit: $scope.selectedUnit.unitName,
            importPrice: $scope.price,
            exportPrice: $scope.price,
            name: $scope.name,
            type: $scope.selectedTypeName.id,
            providerID: $scope.selectedProvider.id,
            imagePath: $scope.name
        };
        $http.post(`/import/createnewgood`, newgood) 
            .then(function successCallback(response) {
                alert("Create new good good successfully with :"+ response.data);
            }, function errorCallback(error) {
                alert("failed send create new good form !");
            });
        $mdDialog.hide();
    };
    

    $scope.cancel = function () {
        $mdDialog.cancel();
    };

    $scope.createNewGoodType = function () {
        popupService.openCreateNewGoodTypePopup();
    };

    $scope.createProvider = function () {
        popupService.openCreateProviderPopup();
    }
    
    $scope.createUnit = function () {
        popupService.openCreateNewUnitPopup();
    }
});