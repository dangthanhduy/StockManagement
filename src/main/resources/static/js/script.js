// create the module and name it demoApp
var demoApp = angular.module('demoApp', ['ngRoute']);
// configure our routes
demoApp.config(function($routeProvider) {
    $routeProvider

    // route for the home page
        .when('/', {
            templateUrl : 'pages/home.html',
            controller  : 'mainController'
        })

        // route for the about page
        .when('/export', {
            templateUrl : 'pages/export.html',
            controller  : 'exportController'
        })

        // route for the contact page
        .when('/import', {
            templateUrl : 'pages/import.html',
            controller  : 'importController'
        })
    
	     // route for the contact page
	    .when('/mystock', {
	        templateUrl : 'pages/mystock.html',
	        controller  : 'mystockController'
	    });
});
// create the controller and inject Angular's $scope
demoApp.controller('mainController', function($scope) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';
    $scope.picture = 'assets/lion.jpg';
});

demoApp.controller('exportController', function($scope, $http) {

    $http.get(`http://localhost:8080/getAllGoods`)
        .then(function successCallback(response){
            alert("Successfull export .....");
            $scope.getAllGoods = response.data.listgoods;
            console.log(response);
        }, function errorCallback(response){
            alert("error export ......");
            console.log("Unable to perform get request export");
            });
});

demoApp.controller('importController', function ($scope, $http) {
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


});

demoApp.controller('mystockController', function($scope) {
    $scope.message = 'Everyone come and see how good I look!';
    $scope.picture = 'assets/frog.jpg';
});