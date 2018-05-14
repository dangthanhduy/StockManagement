appComponent.controller('editImportGoodController', function($scope, $http, $mdDialog, goodsService) {

    var listGoods = {};
    listGoods=	goodsService.getAllGoods();
    const id = goodsService.getGoodsById();
    
    console.log(id);
    for(var index in listGoods) { 
    	if(index == id){
    		// Get value of object in listGoods	
    		// listGoods[index].name
    		$scope.editObject = listGoods[id].name;
    	}
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