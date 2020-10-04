/*
Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */

fun main (){

    val minimo = 1
    val maximo = 50

    for (numero in minimo..maximo step 2){
        println(numero)
    }
}