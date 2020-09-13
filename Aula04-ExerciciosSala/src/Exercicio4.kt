/*
Faça um Programa que peça a temperatura em graus Fahrenheit, transforme emostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9)
 */

fun main(){
    print("Digite a temperatura em Fahrenheit: ")
    val temperaturaFahrenheit = readLine()!!.toDouble()
    val temperaturaCelsius =  5 * ((temperaturaFahrenheit-32) / 9)
    println("Equivale a ${temperaturaCelsius}ºC")
}