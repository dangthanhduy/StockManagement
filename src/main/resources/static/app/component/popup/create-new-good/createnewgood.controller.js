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
            .then(function errorCallback(error) {
                alert("failed send create new good form !");
            }, function successCallback(response) {
//            	response
            	 $scope.successMessage.delay(1500).fadeOut('slow');
                alert("Create new good good successfully with :"+ response.data);
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