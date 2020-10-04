/*
Faça um Programa que leia um vetor de 10 números e mostre-os na ordem inversa.
*/

const val PERGUNTA02 = "Digite um numero: "
fun main() {
    val numeros = ArrayList<Int>()

    for (numero in 1..10) {
        print(PERGUNTA02)
        val numeroLido = readLine()!!.toInt()
        numeros.add(numeroLido)
    }
    numeros.reverse()
    println(numeros)
}