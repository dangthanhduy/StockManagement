appComponent.controller('createNewGoodTypeController', function ($scope, $http, $mdDialog, popupService) {
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

        $http.post(`http://localhost:8080/import/createnewgoodtype`, newgoodtype)
            .then(function successCallback(response) {
                //    Reload new type into tag <select>
//            	popupService.reloadGoodType(response);
            }, function errorCallback(response) {
                alert("failed send create new good form");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    };
});