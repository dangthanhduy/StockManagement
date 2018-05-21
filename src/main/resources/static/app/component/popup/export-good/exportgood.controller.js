appComponent.controller('exportGoodController', function($scope, $http,
		$mdDialog, goodsService) {

	
//	 $http.get(`export/loadcustomergoodtype`)
//     .then(function successCallback(response) {
//         $scope.listProvider = response.data.listProviderName;
//         $scope.listGoodType = response.data.listGoodTypeName;
//         $scope.listUnitType = response.data.listUnitType;
//     }, function errorCallback(response) {
//         alert("Error.....");
//     });
	 
	var listGoods = {};
	listGoods = goodsService.getAllGoods();
	const goodID = goodsService.getGoodsById();

	//	    console.log(id);
	for ( var index in listGoods) {

		if (listGoods[index].id == goodID) {
			// Get value of object in listGoods	
			// listGoods[index].name
			$scope.exportName = listGoods[index].name;
			$scope.exportCode = listGoods[index].code;
			$scope.importPrice = listGoods[index].importPrice;
			$scope.exportPrice = listGoods[index].exportPrice;
			$scope.currentQuatity = listGoods[index].quantity;
		}
	}

	$scope.save = function() {
		var config = {
			headers : {
				'Content-Type' : 'application/json',
				'Accept' : 'text/plain'
			}
		};
		goodupdate = {
			code : $scope.exportCode,
			importPrice : $scope.importPrice,
			exportPrice : $scope.exportPrice,
			quantity : $scope.exportQuantity,
			customerName: $scope.customerName
		};
		$http.post(`/export/exportgood`, goodupdate).then(
				function successCallback(response) {
					if (response.data.statuscode === '200') {
						alert(response.data.message);
					} else {
						alert(response.data.message);
					}

				}, function errorCallback(error) {
					alert("Import failed! Something wrong!!!");
				});
		$mdDialog.hide();
	};

	$scope.cancel = function() {
		$mdDialog.cancel();
	}
});