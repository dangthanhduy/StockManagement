appComponent.controller('createNewGoodController', function ($scope, $http, $mdDialog, popupService) {
    var newgood = {};

    $http.get(`http://localhost:8080/loadprovidergoodtype`)
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
        $http.post(`http://localhost:8080/import/createnewgood`, newgood) 
            .then(function successCallback(response) {
                alert("successed send create new good form !");
            }, function errorCallback(response) {
                alert("failed send create new good form !");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    };

    $scope.createNewGoodType = function () {
        popupService.openCreateNewGoodTypePopup();
        alert("Here");
    };

    $scope.createProvider = function () {
        popupService.openCreateProviderPopup();
    }
});