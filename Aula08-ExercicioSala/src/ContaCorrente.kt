class ContaCorrente(numeroDaConta: Int, saldo: Double, private val taxaDeOperacao: Double) : ContaBancaria(numeroDaConta, saldo) {

    override fun sacar(quantia: Double): Boolean {

        val saqueTotal = quantia + taxaDeOperacao

        if (saqueTotal > saldo) {
            println("Saldo Insuficiente")
            return false
        } else {
            saldo -= saqueTotal
            return true
        }

    }

    override fun depositar(quantiaDeposito: Double): Boolean {

        if (quantiaDeposito >= taxaDeOperacao) {
            saldo += quantiaDeposito - taxaDeOperacao
            return true
        } else return false
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação: $taxaDeOperacao")
    }

}