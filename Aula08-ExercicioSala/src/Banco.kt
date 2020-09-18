class Banco(var contasBancarias: ArrayList<ContaBancaria> = arrayListOf<ContaBancaria>()) : Imprimivel {

    fun inserir(contaBancaria: ContaBancaria) {
        contasBancarias.add(contaBancaria)
    }

    fun remover(contaBancaria: ContaBancaria) {
        contasBancarias.remove(contaBancaria)
    }

    fun procurarConta(contaIndex: Int): ContaBancaria? {

        if (contaIndex in 0..(contasBancarias.size - 1)) {
            return contasBancarias.get(contaIndex)
        } else return null
    }

    override fun mostrarDados() {
        contasBancarias.forEach { it.mostrarDados() }
    }
}