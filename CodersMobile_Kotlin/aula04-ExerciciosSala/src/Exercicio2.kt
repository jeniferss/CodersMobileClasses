/*
Faça um Programa que peça dois números e imprima a soma.
 */
fun main() {
    print("Digite um número: ")
    val numero1 = readLine()!!.toInt()
    print("Digite um número: ")
    val numero2 = readLine()!!.toInt()
    val soma = numero1 + numero2
    println("A soma é $soma")
}