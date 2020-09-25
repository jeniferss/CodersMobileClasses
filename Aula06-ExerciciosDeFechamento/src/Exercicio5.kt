/*
Escrever um código que deve analisar quatro números inteiros e,caso numA seja maior que numC e numD ou caso numB
seja maior que numC e numD, retornar true,caso contrário,retornar false.
*/
const val PERGUNTA5 = "Digite um número: "
fun main() {
    print(analisarNum())
}

fun analisarNum(): Boolean {
    print(PERGUNTA5)
    val numA = readLine()!!.toInt()
    print(PERGUNTA5)
    val numB = readLine()!!.toInt()
    print(PERGUNTA5)
    val numC = readLine()!!.toInt()
    print(PERGUNTA5)
    val numD = readLine()!!.toInt()
    return numA > numC && numA > numD || numB > numC && numB > numD
}

