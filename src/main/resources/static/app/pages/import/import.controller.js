appPages.controller('importController', function ($scope, $http, popupService, goodsService) {
    $scope.submit = function () {
        var name = $scope.name;
        var type = $scope.type;
        var code = $scope.code;
        var unit = $scope.unit;
        var price = $scope.price;
        $http.get(`/createGood?name=${name}&type=${type}&code=${code}&unit=${unit}&price=${price}`)
            .then(function successCallback(response) {
                $scope.response = response;
            }, function errorCallback(response) {
                alert("Data is invalid......");
                console.log("Unable to perform get request");
            });
    };

    $scope.submitGoodType = function () {
        var name = $scope.goodTypeName;
        var code = $scope.goodTypeCode;
        var description = $scope.goodTypeDescription;
        $http.get(`/createGoodType?name=${name}&code=${code}&description=${description}`)
            .then(function successCallback(response) {
                alert("Successfull......");
                $scope.response = response;
            }, function errorCallback(response) {
                alert("Good Type is invalid......");
                console.log("Unable to perform get request aaa");
            });
    };
//
//    $http.get(`http://localhost:8080/loadprovidergoodtype`)
//        .then(function successCallback(response) {
//            $scope.listProvider = response.data.listProviderName;
//            $scope.nameItems = response.data;
//            console.log("import", $scope.nameItems.listProviderName);
//            console.log("import", response.data);
//        }, function errorCallback(response) {
//            alert("Error.....");
//        });

    $scope.createNewGoods = function () {
        popupService.openCreateNewGoodPopup();
    };

    $scope.importGoods = function () {
        popupService.openImportGoodPopup();
    };
    
    var config = {
            headers: {
                'Content-Type': 'application/json',
                'Accept': '*/*'
            }
        };

    //Get All goods and fill into table
    $http.get(`/import/getallgoods`)
        .then(function successCallback(response) {
            $scope.getAllGoodsImportPage = response.data.listgoods;
            goodsService.setAllGoods(response.data.listgoods);
            console.log(response);
        }, function errorCallback(response) {
            alert("Cannot get all goods......");
            console.log("Unable to perform get request export");
        });

//    $scope.editGoods = function (id) {
//        goodsService.setGoodsById(id);
//        popupService.openEditGoodPopup();
//    }
    
    $scope.editGoods = function (id) {
      goodsService.setGoodsById(id);
      popupService.openEditGoodPopup();
        
    }
});