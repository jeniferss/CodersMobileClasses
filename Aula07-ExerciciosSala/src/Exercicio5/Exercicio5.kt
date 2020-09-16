package Exercicio5

fun main(){
    val veiculo = Veiculo("Toyota", "Hilux", 2019, "Vermelha", 25.0)
    val cliente = Cliente("Jenifer", "Soares", "(11) 90000-0000")
    val venda = Venda(cliente, veiculo, 180000.0)
    val registro0 = Concessionaria()

    registro0.registrarVenda(cliente,veiculo, venda.valorDaVenda )
}