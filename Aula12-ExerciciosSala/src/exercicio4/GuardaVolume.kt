package exercicio4

class GuardaVolume(var dicionario: MutableMap<Int, List<Peca>> = mutableMapOf())  {


   fun guardar(listaDePeca: List<Peca>): Int {
       val contador = kotlin.random.Random.nextInt(100)
       dicionario[contador] = listaDePeca
       return contador
   }

    fun mostrarPecas(){
            println(dicionario)
    }


    fun mostrarPecas(numero: Int){
        println(dicionario[numero])
    }


    fun devolverPecas(contador: Int) {
        dicionario.remove(contador)
    }
}

