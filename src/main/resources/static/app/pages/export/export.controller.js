appPages.controller('exportController', function($scope, $http, popupService) {

	
	//Export Good button click
	  $scope.exportGood = function(){
	        popupService.openExportGoodPopup();
	    };

	
	
	
	//Get all good load into table
    // $http.get(`http://localhost:8080/getallgoods`)
     //    .then(function successCallback(response){
     //        $scope.getAllGoods = response.data.listgoods;
     //        console.log(response);
     //    }, function errorCallback(response){
     //        alert("Cannot get all goods......");
     //        console.log("Unable to perform get request export");
     //    });

});