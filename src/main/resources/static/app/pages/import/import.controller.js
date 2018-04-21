appPages.controller('importController', function ($scope, $http, popupService) {
    $scope.submit = function () {
        var  name = $scope.name;
        var  type = $scope.type;
        var  code = $scope.code;
        var  unit = $scope.unit;
        var  price = $scope.price;
        $http.get(`http://localhost:8080/createGood?name=${name}&type=${type}&code=${code}&unit=${unit}&price=${price}`)
            .then(function successCallback(response){
                $scope.response = response;
            }, function errorCallback(response){
                alert("Data is invalid......");
                console.log("Unable to perform get request");
            });
    };

    $scope.submitGoodType = function () {
        var  name = $scope.goodTypeName;
        var  code = $scope.goodTypeCode;
        var  description = $scope.goodTypeDescription;
        $http.get(`http://localhost:8080/createGoodType?name=${name}&code=${code}&description=${description}`)
            .then(function successCallback(response){
                alert("Successfull......");
                $scope.response = response;
            }, function errorCallback(response){
                alert("Good Type is invalid......");
                console.log("Unable to perform get request aaa");
            });
    };

    $http.get(`http://localhost:8080/getallgoodtypes`)
        .then(function successCallback(response){
            $scope.nameItems = response.data;
            console.log($scope.nameItems);
        }, function errorCallback(response){
            alert("Error.....");
        });

    $scope.createNewGoods = function(){
        popupService.openCreateNewGoodPopup();
    };

    
    //Get All goods and fill into table
    $http.get(`http://localhost:8080/getallgoods`)
    .then(function successCallback(response){
        $scope.getAllGoodsImportPage = response.data.listgoods;
        console.log(response);
    }, function errorCallback(response){
        alert("Cannot get all goods......");
        console.log("Unable to perform get request export");
    });

});