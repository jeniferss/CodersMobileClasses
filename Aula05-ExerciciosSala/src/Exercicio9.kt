/*
Faça um programa que calcule e mostre a média aritméticade N notas.
 */


import kotlin.math.round

fun main(){

    print("Digite o número de notas que você vai calcular: ")

    var quantidadeNotas = readLine()!!.toInt()
    var count = 0
    var somatoriaNotas = 0.0F

    while (quantidadeNotas > 0) {
        quantidadeNotas--
        print("digite a ${++count}ª nota: ")
        val nota = readLine()!!.toFloat()
        somatoriaNotas += nota
    }

    val media = round(somatoriaNotas / count)
    println("A média das notas é $media")
}
