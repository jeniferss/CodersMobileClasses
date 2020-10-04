abstract class ContaBancaria(private val numeroDaConta: Int, protected var saldo: Double) : Imprimivel {

    abstract fun sacar(quantia: Double): Boolean
    abstract fun depositar(quantiaDeposito: Double): Boolean

    override fun mostrarDados() {
        println("Conta: $numeroDaConta")
        println("Saldo: $saldo")
    }

    fun transferir(quantiaTranferencia: Double, contaDestino: ContaBancaria) {

        var ultimoSaldo = saldo

        if (sacar(quantiaTranferencia) == false || contaDestino.depositar(quantiaTranferencia) == false) {
            saldo = ultimoSaldo
            println("Operação cancelada")
        }
    }

    fun obterConta(): Int {
        return numeroDaConta
    }

}