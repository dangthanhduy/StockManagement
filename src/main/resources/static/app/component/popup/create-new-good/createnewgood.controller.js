appComponent.controller('createNewGoodController', function($scope, $http, $mdDialog) {
    var newgood = {};

	$http.get(`http://localhost:8080/loadprovidergoodtype`)
    .then(function successCallback(response){
        $scope.listProvider = response.data.listProviderName;
        $scope.listGoodType = response.data.listGoodTypeName;
    }, function errorCallback(response){
        alert("Error.....");
    });

    $scope.showSelect = function(selectedType, selectedProvider) {
        newgood = {
            name: $scope.name,
            selectedName: selectedType,
            selectedType: selectedProvider,
            code: $scope.code,
            unit: $scope.unit,
            price: $scope.price
        };
    };
    //quang cai rest API de create new  vo cho nay
    $scope.save = function () {
        $http.post(``, {
            data: newgood
        })
            .then(function successCallback(response){
                alert("successed send create new good form");
            }, function errorCallback(response){
                alert("failed send create new good form");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    }
});