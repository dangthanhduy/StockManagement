appComponent.controller('createNewGoodTypeController', function($scope, $http) {

    $http.get(``)
        .then(function successCallback(response){

        }, function errorCallback(response){

        });

    $http.get('10.88.127.151:8080/getallgoodtypes')
        .then(function successCallback(response){
            $scope.nameItems = response;
        }, function errorCallback(response){
            alert("Error.....");
        });

});