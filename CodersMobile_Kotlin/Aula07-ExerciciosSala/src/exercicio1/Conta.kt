package exercicio1

class Conta (numeroDaConta: String, var saldo: Double, titular: Cliente) {



    fun depositar(quantiaEmDinheiro: Double) {
        saldo += quantiaEmDinheiro
        println("Depósito")
        println("Novo Saldo: $saldo")
    }


    fun sacar(quantiaEmDinheiroSaque: Double) {
        if(saldo > quantiaEmDinheiroSaque ) {
            saldo -= quantiaEmDinheiroSaque
            println("Saque")
            println("Novo Saldo: $saldo")
        } else println("Saldo Insuficiente")

    }
}