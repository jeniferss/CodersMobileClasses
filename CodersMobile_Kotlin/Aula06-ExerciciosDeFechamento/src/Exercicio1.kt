/*
Escrever o código que deve analisar três números inteiros e retornar o maior deles.
*/

import kotlin.math.max

const val PERGUNTA = "Digite um número: "
fun main() {
    print("O maior deles é: ${analisarMaior()}")
}

fun analisarMaior (): Int {
    print(PERGUNTA)
    val numero1 = readLine()!!.toInt()
    print(PERGUNTA)
    val numero2 = readLine()!!.toInt()
    print(PERGUNTA)
    val numero3 = readLine()!!.toInt()
    return  max(numero3, max(numero1, numero2))
}




