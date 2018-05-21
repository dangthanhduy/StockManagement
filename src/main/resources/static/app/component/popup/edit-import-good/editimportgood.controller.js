appComponent.controller('editImportGoodController', function($scope, $http, $mdDialog, goodsService) {

    var listGoods = {};
    listGoods=	goodsService.getAllGoods();
    const goodID = goodsService.getGoodsById();
    
//    console.log(id);
    for(var index in listGoods) { 
    	
    	if( listGoods[index].id == goodID){
    		// Get value of object in listGoods	
    		// listGoods[index].name
    		$scope.editName = listGoods[index].name;
    		$scope.editCode = listGoods[index].code;
    		$scope.editUnit = listGoods[index].unit;
    		$scope.editPrice = listGoods[index].importPrice;
    		$scope.currentQuatity = listGoods[index].quantity;
    	}
    }
   
    $scope.save = function () {
        var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'text/plain'
            }
        };
        goodupdate = {
            code: $scope.editCode,
            importPrice: $scope.editPrice,
//            exportPrice: $scope.editExportPrice,
            quantity : $scope.editQuantity
        };
        $http.post(`/import/importgood`, goodupdate) 
            .then(function successCallback(response) {
            	if(response.data.statuscode === '200'){
            		 alert(response.data.message);
            	} else {
            		 alert(response.data.message);
            	}
               
            }, function errorCallback(error) {
                alert("Import failed! Something wrong!!!");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    }
});