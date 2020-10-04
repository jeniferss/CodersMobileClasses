/*
Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar.
Dica: utilize o operador módulo (resto da divisão)
*/

fun main(){

    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if(numero%2 == 0){
        println("O número é Par")
    } else {
        println("O número é Ímpar")
    }
}