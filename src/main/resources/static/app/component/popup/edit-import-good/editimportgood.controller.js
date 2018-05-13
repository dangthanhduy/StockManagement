appComponent.controller('editImportGoodController', function($scope, $http, $mdDialog, goodsService) {

    goodsService.getAllGoods();
    const id = goodsService.getGoodsById();
    if ( goodsService.getAllGoods().id === id) {
    }
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