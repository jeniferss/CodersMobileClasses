class ContaPoupanca(numeroDaConta: Int, saldo: Double, private var limiteDeCredito: Double) : ContaBancaria(numeroDaConta, saldo) {

    override fun sacar(quantia: Double): Boolean {

        val saldoTotal = saldo + limiteDeCredito

        if (quantia > saldoTotal) {
            println("Saldo Insuficiente")
            return false
        } else {
            saldo -= quantia
            return true
        }
    }

    override fun depositar(quantiaDeposito: Double): Boolean {
        saldo += quantiaDeposito
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite de Crédito: $limiteDeCredito")
    }

}