appComponent.controller('editImportGoodController', function($scope, $http, $mdDialog, goodsService) {

    var listGoods = {};
    listGoods=	goodsService.getAllGoods();
    const id = goodsService.getGoodsById();
    
    $http.get(`/loadprovidergoodtype`)
    .then(function successCallback(response) {
        $scope.listProvider = response.data.listProviderName;
        $scope.listGoodType = response.data.listGoodTypeName;
        $scope.listUnitType = response.data.listUnitType;
    }, function errorCallback(response) {
        alert("Error.....");
    });
    
    console.log(id);
    for(var index in listGoods) { 
    	if(index == id){
    		// Get value of object in listGoods	
    		// listGoods[index].name
    		$scope.editName = listGoods[id-1].name;
    		$scope.selectedTypeName = listGoods[id-1].goodType.decription;
//    		listGoods[id-1].provider.providerName
    		$scope.editProvider = '2';
    		$scope.editCode = listGoods[id-1].code;
    		$scope.editUnit = listGoods[id-1].unit;
    		$scope.editPrice = listGoods[id-1].importPrice;
    		$scope.editExportPrice = listGoods[id-1].exportPrice;
    		$scope.quantity = listGoods[id-1].quantity;
    		$scope.editType = listGoods[id-1].goodType.typeName;
    		$scope.editProvider = listGoods[id-1].provider.providerName;
    	}
    }
   
    $scope.save = function () {

        var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'text/plain'
            }
        };
        newgood = {
        	id:goodsService.getGoodsById(),
            code: $scope.editCode,
            unit: $scope.editUnit.id,
            importPrice: $scope.editPrice,
            exportPrice: $scope.editExportPrice,
            name: $scope.editName,
            type: $scope.editType.id,
            providerID: $scope.editProvider.id,
            quantity : $scope.quantity
        };
        $http.post(`/import/createnewgood`, newgood) 
            .then(function successCallback(response) {
                alert("Create new good good successfully with :"+ response.data);
            }, function errorCallback(error) {
                alert("failed send create new good form !");
            });
        $mdDialog.hide();
    };

    $scope.cancel = function () {
        $mdDialog.cancel();
    }
});