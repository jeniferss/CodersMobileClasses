package Exercicio1

fun main () {
    val cliente: Cliente = Cliente("Jenifer" , "Soares")
    val conta: Conta = Conta("000.000.000-0", 500.0, cliente)
    conta.deposito(100.0)
    conta.saque(100.0)
    println("-----------------")
    val cliente1: Cliente = Cliente("Jenifer" , "Souza")
    val conta1: Conta = Conta("000.000.000-1", 200.0, cliente1)
    conta.deposito(100.0)
    conta.saque(100.0)
}