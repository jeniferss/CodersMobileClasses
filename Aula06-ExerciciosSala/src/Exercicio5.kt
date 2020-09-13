/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar
quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocuparcom a quantidade de notas
existentes na máquina.
 */

const val PERGUNTA05 = "Informe o valor do saque: "
fun main() {
    val arrayNotas = arrayOf(100, 50, 10, 5, 1)
    val arrayQuantidadeNotas = arrayOf(0, 0, 0, 0, 0)
    print(PERGUNTA05)
    var valor = readLine()!!.toInt()
    if (valor in 10..600) {
        for (i in 0..4) {
            if (valor != 0) {
                arrayQuantidadeNotas[i] = valor / arrayNotas[i]
                valor %= arrayNotas[i]
                println("Notas de ${arrayNotas[i]}: ${arrayQuantidadeNotas[i]}")
            } else break
        }
    } else println("Valor Inválido")
}