/*
Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor
entre 2 e 12. Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12
na primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,
este é seu "Ponto". Seu objetivo agora é continuar jogando os dados até tirar este número novamente.
Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente. Exemplo:

Rolar dados? (s ou n)
Você tirou 7! Parabéns você ganhou!

Rolar dados? (s ou n)Você tirou 8!
Aperte enter para tentar novamente

Você tirou 7!
Você perdeu =(

Dica: Para obter valores aleatórios use Random.nextInt(DE, ATE)

 */

import kotlin.random.Random


const val PERGUNTA09 = "Rolar dados? (s ou n) "
var somaDado = 0
var aux = true

fun main() {
    print(PERGUNTA09)
    val resposta = readLine()!!.toLowerCase()
    if (resposta == "s") primeiraPartida() else println("Fim de jogo")
    if (aux) proximaPartida()
    println("Fim de jogo")
}

fun primeiraPartida() {

    val dado1 = Random.nextInt(1, 6)
    val dado2 = Random.nextInt(1, 6)
    somaDado = dado1 + dado2

    when (somaDado) {
        7, 11 -> {
            println("Você tirou ${somaDado}: Você ganhou!")
            aux = false
        }
        2, 3, 12 -> {
            println("Você tirou ${somaDado}: Você perdeu!")
            aux = false
        }
        else -> println("Você tirou ${somaDado}: Aperte s e enter para tentar novamente!")
    }
}

fun proximaPartida() {

    do {
        val continuacao = readLine()!!.toLowerCase()

        if (continuacao == "s") {
            val dado3 = Random.nextInt(1, 6)
            val dado4 = Random.nextInt(1, 6)
            val soma = dado3 + dado4

            if (soma == 7) {
                println("Você tirou ${soma}: Você perdeu!")
                break
            } else if (somaDado == soma) {
                println("Você tirou ${soma}: Você ganhou!")
                break
            } else {
                println("Você tirou ${soma}: Aperte s e enter para tentar novamente!")
                continue
            }
        } else break

    } while (true)

}


