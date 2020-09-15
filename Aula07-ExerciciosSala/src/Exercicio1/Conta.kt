package Exercicio1

class Conta (numeroDaConta: String, saldo: Double, titular: Cliente) {

    var saldo = saldo

    fun deposito(quantiaEmDinheiro: Double) {
        saldo = saldo + quantiaEmDinheiro
        println("Depósito")
        println("Novo Saldo: $saldo")
    }


    fun saque(quantiaEmDinheiroSaque: Double) {
        if(saldo > quantiaEmDinheiroSaque ) {
            saldo = saldo - quantiaEmDinheiroSaque
            println("Saque")
            println("Novo Saldo: $saldo")
        } else println("Saldo Insuficiente")

    }
}