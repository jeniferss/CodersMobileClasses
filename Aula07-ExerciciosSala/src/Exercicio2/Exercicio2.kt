package Exercicio2

fun main(){
    val jogador = JogadorDeFutebol("Gabriel", 100, 10, 0, 0)

    val treinamentoJogador = SessaoDeTreinamento(10)
    treinamentoJogador.treinarA(jogador)

    println("----------------------------------------------")

    val jogador0 = JogadorDeFutebol("André", 80, 6, 15, 30)

    val treinamentoJogador0 = SessaoDeTreinamento(5)
    treinamentoJogador0.treinarA(jogador0)
}