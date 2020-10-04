package exercicio4

data class Pertence(val marcaP: String,val modeloP: String): Peca(marcaP, modeloP) {
    override fun retirada() {
    }
}