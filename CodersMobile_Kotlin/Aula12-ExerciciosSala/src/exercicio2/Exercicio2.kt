package exercicio2

fun main(){
    val lista = listOf<Int>(1, 5, 5, 6, 7, 8, 8, 8)
    val listaSet = setOf<Int>(1, 5, 5, 6, 7, 8, 8, 8)

    lista.forEach{
        print(" $it")
    }

    println()

    listaSet.forEach{
        print(" $it")
    }
}