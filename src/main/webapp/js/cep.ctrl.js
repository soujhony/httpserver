angular.module('app')
    .controller('CepCtrl', CepCtrl);

CepCtrl.$inject = ['CepService'];

function CepCtrl(CepService) {
    var vm = this;

    vm.consultar = function() {
        CepService.consultar(vm.cep)
            .then(function(data) {
                vm.logradouro = data.logradouro;
                vm.cidade = data.cidade;
                vm.estado = data.uf;
            });
    }
}
