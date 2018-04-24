appComponent.controller('createProviderController', function ($scope, $http, $mdDialog) {
    var newprovider = {};

    $scope.save = function () {

        var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'text/plain'
            }
        };

        newprovider = {
            providerName: $scope.providerName,
            phoneNumber: $scope.phoneNumber,
            address: $scope.address,
            vote: $scope.vote,
            description: $scope.description
        };

        $http.post(`http://localhost:8080/import/createnewprovider`, {
            data: newprovider
        }, config)
            .then(function successCallback(response) {
                // binding
            }, function errorCallback(response) {
                alert("failed send create new good form");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    };

});