appComponent.controller('createUnitController', function ($scope, $http, $mdDialog, popupService) {
    var newUnit = {};

    $scope.save = function () {

        var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': '*/*'
            }
        };

        newUnit = {
            unitName: $scope.unitName,
            description: $scope.unitDescription
        };

        $http.post(`/import/createnewunit`, newUnit)
            .then(function successCallback(response) {
                alert("Create Unit success with name " + response.data.newUnitID)
            }, function errorCallback(response) {
                alert("Failed! Unit haven't create");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    };

});