package exercicio3

class Prova(val dificuldade: Int, val energiaNecessaria: Int) {

    fun realizarProva(atleta: Atleta): Boolean {

        if (atleta.energia > energiaNecessaria && atleta.nivel >= dificuldade ){
            atleta.energia = atleta.energia - energiaNecessaria
            return true
        } else return false
    }
}