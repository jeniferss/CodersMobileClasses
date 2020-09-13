/*
Escrever o código que deve analisar um número inteiro e,caso ele seja par,retornar true,caso contrário,retorna false.
 */

const val PERGUNTA3 = "Digite um número: "
fun main() {
    print(ehPar())
}

fun ehPar(): Boolean {
    print(PERGUNTA3)
    val numeroInt = readLine()!!.toInt()
    return numeroInt % 2 == 0
}

