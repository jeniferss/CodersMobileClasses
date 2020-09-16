package Exercicio1

fun main () {
    val cliente = Cliente("Jenifer" , "Soares")
    val conta = Conta("000.000.000-0", 600.0, cliente)
    conta.depositar(100.0)
    conta.sacar(100.0)
    println("-----------------")
    val cliente0 = Cliente("Jenifer" , "Souza")
    val conta0 = Conta("000.000.000-1", 0.0, cliente0)
    conta0.depositar(250.0)
    conta0.sacar(200.0)
}
