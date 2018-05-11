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
            .then( function successCallback(response) {
                alert("Create good type success with name : " + response.data.goodTypeID);
            }, function errorCallback(response) {
            	alert("Failed! GoodType haven't create");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    };
});