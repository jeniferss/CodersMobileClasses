/*
Faça um programa que receba dois números inteiros e gere os números inteiros que estão
no intervalo compreendido por eles.
*/

import kotlin.math.max
import kotlin.math.min

fun main(){

    print("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()

    for(numero in min(numero1,numero2)+1 until max(numero1,numero2)){
        println(numero)
    }
}
