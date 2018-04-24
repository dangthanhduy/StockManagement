appComponent.controller('createNewGoodTypeController', function ($scope, $http, $mdDialog) {
    var newgoodtype = {};

    $scope.save = function () {
        var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'text/plain'
            }
        };

        newgoodtype = {
            typeName: $scope.typeName,
            code: $scope.code,
            description: $scope.description
        };

        $http.post(`http://localhost:8080/import/createnewgoodtype`, {
            data: newgoodtype
        }, config)
            .then(function successCallback(response) {
                //    binding save var
            }, function errorCallback(response) {
                alert("failed send create new good form");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    };
});