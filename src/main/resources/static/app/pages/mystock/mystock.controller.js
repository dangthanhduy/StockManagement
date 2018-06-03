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
    
    
    $scope.submitFilter = function () {
    	var config = {
                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'text/plain'
                }
            };
    	filterModel = {
                code: $scope.codeFilter,
                name: $scope.nameFilter,
                fromDate: $scope.fromDateFilter,
                toDate: $scope.toDateFilter,
                type: $scope.selectedTypeFilter
            };
            $http.post(`/mystock/filter`, filterModel) 
                .then(function successCallback(response) {
                	$scope.getAllLog = response.data.listLog;
                	$scope.totalView = response.data.totalExport - response.data.totalImport;
                	if ($scope.totalView > 0) {
                		$scope.totalStyle={'color':'green'};
                	} else {
                		if ($scope.totalView == 0) {
                			$scope.totalStyle={'color': 'orange'};
                		} else {
                			$scope.totalStyle={'color':'red'};
                		}
                	}
                		$scope.importView = response.data.totalImport;
                		$scope.exportView = response.data.totalExport;
                	
                }, function errorCallback(error) {
                    alert("Filter failed");
                });
       
    };
    
});