angular
    .module('demoApp')
    .factory('goodsService', goodsService);

function goodsService() {
    var service = {};
    service.setAllGoods = setAllGoods;
    service.getAllGoods = getAllGoods;
    service.setGoodsById = setGoodsById;
    service.getGoodsById = getGoodsById;

    return service;
    
    function setAllGoods(listgoods) {
    	var _listgoods = {};
        this._listgoods = listgoods;
    }

    function getAllGoods() {
        return this._listgoods;
    }

    function setGoodsById(id) {
        this._id = id;
    }

    function getGoodsById() {
        return this._id;
    }
};