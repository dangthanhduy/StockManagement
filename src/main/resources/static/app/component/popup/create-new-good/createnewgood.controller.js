appComponent.controller('createNewGoodController', function($scope, $http, $mdDialog) {

	$http.get(`http://localhost:8080/loadprovidergoodtype`)
    .then(function successCallback(response){
        $scope.listProvider = response.data.listProviderName;
        $scope.listGoodType = response.data.listGoodTypeName;
    }, function errorCallback(response){
        alert("Error.....");
    });
	
    $scope.save = function () {
        $http.get(``)
            .then(function successCallback(response){

            }, function errorCallback(response){

            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    }
});