angular.module('app')
    .service('CepService', CepService);

CepService.$inject = ['$http'];

function CepService($http) {
    var URL='http://apicorreios.herokuapp.com/api/cep/';

    var service = this;
    service.consultar = function(cep) {
        return $http.get(URL + cep)
            .then(function(resp) {
                return resp.data;
            });
    }
}