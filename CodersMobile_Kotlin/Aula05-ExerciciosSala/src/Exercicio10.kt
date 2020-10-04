/*
Desenvolva um gerador de tabuada, capaz de gerara tabuada de qualquernúmero inteiro entre 1 a 10.
O usuário deve informarde qual número ele deseja ver a tabuada.
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
5 X 10 = 50 ...
 */

fun main() {

    print("Digite o número da tabuada que você quer calcular: ")
    val numero = readLine()!!.toInt()
    println("Tabuada de ${numero}:")

    for (count in 1..10) {
        val resultado = numero * count
        println("$numero x $count = $resultado")
    }
}
