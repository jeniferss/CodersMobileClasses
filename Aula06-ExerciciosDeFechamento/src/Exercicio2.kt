/*
Escrever o código que deve analisar duas cadeias de texto e,caso sejam diferentes,retornar true,ou,caso sejam
iguais,retornar false.
 */

const val PERGUNTA2 = "Digite um texto: "
fun main() {
    print(analisarCadeias())
}

fun analisarCadeias(): Boolean {
    print(PERGUNTA2)
    val cadeia1 = readLine()
    print(PERGUNTA2)
    val cadeia2 = readLine()
    return !cadeia1.equals(cadeia2)
}
