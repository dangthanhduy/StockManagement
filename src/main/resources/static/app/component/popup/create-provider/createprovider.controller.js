appComponent.controller('createProviderController', function ($scope, $http, $mdDialog, popupService) {
    var newprovider = {};

    $scope.save = function () {

        var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': '*/*'
            }
        };

        newprovider = {
            providerName: $scope.providerName,
            phoneNumber: $scope.phoneNumber,
            address: $scope.address,
            vote: $scope.vote,
            description: $scope.description
        };

        $http.post(`/import/createnewprovider`, newprovider)
            .then(function successCallback(response) {
                alert("Create provider success with name " + response.data.providerID)
            }, function errorCallback(response) {
                alert("Failed! Provider haven't create");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    };

});