angular
    .module('app')
    .controller('MeuCtrl', MeuCtrl);

function MeuCtrl() {
    var vm = this;

    vm.nome = null;
    vm.peso = null;
    vm.altura = null;

    vm.calcular = function() {
        vm.imc = vm.peso / (vm.altura * vm.altura);
    }

}
