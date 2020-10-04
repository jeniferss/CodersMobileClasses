/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

fun main() {
    print("Digite a nota 1: ")
    var nota1 = readLine()!!.toFloat()
    print("Digite a nota 2: ")
    var nota2 = readLine()!!.toFloat()
    print("Digite a nota 3: ")
    var nota3 = readLine()!!.toFloat()
    print("Digite a nota 4: ")
    var nota4 = readLine()!!.toFloat()
    var media = (nota1 + nota2 + nota3 + nota4) / 4
    println()
    println("A média é $media")
}