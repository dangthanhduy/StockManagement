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
        .when('/import', {
            templateUrl : 'pages/import.html',
            controller  : 'importController'
        })

        // route for the contact page
        .when('/export', {
            templateUrl : 'pages/export.html',
            controller  : 'exportController'
        });
});
// create the controller and inject Angular's $scope
demoApp.controller('mainController', function($scope) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';
    $scope.picture = 'assets/lion.jpg';
});

demoApp.controller('importController', function($scope) {
    $scope.message = 'Look! I am an about page.';
    $scope.picture = 'assets/frog.jpg';
});

demoApp.controller('exportController', function($scope) {
    $scope.message = 'Contact us! JK. This is just a demo.';
    $scope.picture = 'assets/snowleopard.jpg';
});