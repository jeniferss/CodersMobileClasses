/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */


const val PERGUNTA01 = "Digite um numero: "
fun main() {
    val numeros = ArrayList<Int>()

    for (numero in 1..5) {
        print(PERGUNTA01)
        val numeroLido = readLine()!!.toInt()
        numeros.add(numeroLido)
    }
    println(numeros)
}