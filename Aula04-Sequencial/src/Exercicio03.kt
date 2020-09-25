/*
Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo quecalcule seu peso ideal,
utilizando as seguintes fórmulas:
Para homens: (72.7 * h) - 58
Para mulheres: (62.1 * h) - 44.7
 */
fun main() {
    print("Digite a altura: ")
    var h = readLine()!!.toFloat()
    val paraHomens =  (72.7 * h) - 58
    val paraMulheres =  (62.1 * h) - 44.7
    println()
    println("Para homens: $paraHomens")
    println("Para mulheres $paraMulheres")
}