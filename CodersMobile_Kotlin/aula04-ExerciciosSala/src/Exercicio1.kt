/*
Faça um Programa que peça um número e então mostre a mensagem: O número informado foi [número].
 */

fun main(){
    print("Digite um número: ")
    val numeroDigitado = readLine()!!.toInt()
    println("O número informado foi $numeroDigitado")
}