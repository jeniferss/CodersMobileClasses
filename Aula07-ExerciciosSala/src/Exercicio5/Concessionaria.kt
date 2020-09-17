package Exercicio5

class Concessionaria () {
    val registroDeVenda = arrayListOf<Venda>()

    fun registrarVenda(cliente: Cliente, veiculo: Veiculo, valorDaVenda: Double){
        val novaVenda = Venda(cliente, veiculo, valorDaVenda)
        registroDeVenda.add(novaVenda)
    }
}