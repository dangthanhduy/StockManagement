appPages.controller('exportController', function($scope, $http) {

    $http.get(`http://332170eb.ngrok.io/getallgoods`)
        .then(function successCallback(response){
            alert("Successfull export .....");
            $scope.getAllGoods = response.data.listgoods;
            console.log(response);
        }, function errorCallback(response){
            alert("error export 1111......");
            console.log("Unable to perform get request export");
        });

});