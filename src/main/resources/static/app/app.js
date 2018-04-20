// create the module and name it demoApp
var demoApp = angular.module('demoApp', ['ngRoute', 'ngMaterial', 'app.pages', 'app.component']);

// configure our routes

demoApp.config(function($routeProvider) {
    $routeProvider

    // route for the home page
        .when('/', {
            template : '<home></home>'
        })

        // route for the about page
        .when('/export', {
            template : '<export></export>'
        })

        // route for the contact page
        .when('/import', {
            template : '<import></import>'
        })

        // route for the contact page
        .when('/mystock', {
            template : '<my-stock></my-stock>'
        });
});