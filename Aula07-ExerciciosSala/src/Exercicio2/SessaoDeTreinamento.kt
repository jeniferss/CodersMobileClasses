package Exercicio2

class SessaoDeTreinamento (var experienciaGanha: Int){

    fun treinarA (jogador: JogadorDeFutebol){
        val experienciaInicial = jogador.experiencia
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += experienciaGanha
        println("Experiencial Inicial: $experienciaInicial")
        println("Experiencial Final: ${jogador.experiencia}")
    }
}