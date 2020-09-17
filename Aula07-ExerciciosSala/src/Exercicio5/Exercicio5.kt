package Exercicio5

fun main(){
    val veiculo = Veiculo("Toyota", "Hilux", 2019, "Vermelha", 25.0)
    val cliente = Cliente("Jenifer", "Soares", "(11) 90000-0000")

    val concessionaria = Concessionaria()


   concessionaria.registrarVenda(cliente,veiculo, 120000.0)
}