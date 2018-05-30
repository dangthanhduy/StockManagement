appPages.controller('mystockController', function($scope, $http) {
	//Get All goods and fill into table
    $http.get(`/mystock/getalllogs`)
        .then(function successCallback(response) {
            $scope.getAllLog = response.data.listLog;
//            goodsService.setAllGoods(response.data.listLog);
            console.log(response);
        }, function errorCallback(response) {
            alert("Cannot get all goods......");
            console.log("Unable to perform get request export");
        });
    
    
    $scope.searchData   = '';     // set the default search/filter term
    
    // create the list of sushi rolls 
//    $scope.sushi = [
//      { name: 'Cali Roll', fish: 'Crab', tastiness: 2 },
//      { name: 'Philly', fish: 'Tuna', tastiness: 4 },
//      { name: 'Tiger', fish: 'Eel', tastiness: 7 },
//      { name: 'Rainbow', fish: 'Variety', tastiness: 6 }
//    ];
    
});