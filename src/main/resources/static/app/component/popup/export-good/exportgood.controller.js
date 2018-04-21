appComponent.controller('exportGoodController', function($scope, $http, $mdDialog) {

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