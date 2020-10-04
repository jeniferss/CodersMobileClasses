/*
Faça um programa que leia 5 números e informe o maior número.
 */

import kotlin.math.max

fun main(){

    var count = 0
    var maiorNumero = 0
    val quantidadeDeNumerosALer = 5

    do {
        count += 1
        print("digite o ${count}º número: ")
        val numero = readLine()!!.toInt()
        maiorNumero = max(maiorNumero, numero)
    } while (count < quantidadeDeNumerosALer)
    println("O maior número é $maiorNumero")
}

