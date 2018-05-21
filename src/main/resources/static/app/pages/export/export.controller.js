appPages.controller('exportController', function($scope, $http, popupService, goodsService) {

	
	//Export Good button click
	  $scope.exportGood = function(){
	        popupService.openExportGoodPopup();
	    };

	
	
	
//	Get all good load into table
     $http.get(`/import/getallgoods`)
         .then(function successCallback(response){
             $scope.getAllGoods = response.data.listgoods;
             goodsService.setAllGoods(response.data.listgoods);
             console.log(response);
         }, function errorCallback(response){
             alert("Cannot get all goods......");
             console.log("Unable to perform get request export");
         });
     
     
     $scope.exportGood = function (id) {
         goodsService.setGoodsById(id);
         popupService.openExportGoodPopup();
           
       }
     
     
     
     
     

});