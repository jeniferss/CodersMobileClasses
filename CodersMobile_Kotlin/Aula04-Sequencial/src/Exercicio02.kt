/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horastrabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.
 */
fun main() {
    print("Quanto vale sua hora? ")
    var valorHora = readLine()!!.toDouble()
    print("Quantas horas você trabalhou? ")
    var horasTrabalhadas = readLine()!!.toDouble()
    var valorTotal = valorHora * horasTrabalhadas
    println()
    println("A média é $valorTotal")
}