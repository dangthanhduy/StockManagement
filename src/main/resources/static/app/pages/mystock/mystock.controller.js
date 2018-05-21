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
});