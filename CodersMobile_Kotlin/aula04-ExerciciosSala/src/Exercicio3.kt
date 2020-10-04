/*
Faça um Programa que converta metros para centímetros.
 */

fun main(){
    print("Digite a metragem: ")
    val metragem = readLine()!!.toDouble()
    val centimetros = metragem * 100
    println("Equivale a ${centimetros} centimetros")
}