package exercicio1

fun main(){

    val dicionarioDosSonhos = mapOf<Int, String>(0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo" )

    val nomes = arrayListOf("Juan", "Fissura", "Maromba")
    val nomes1 = arrayListOf("Night Watch", "Bruce Wayne" , "Tampinha")
    val nomes2 = arrayListOf("Wonder Woman", "Mary", "Marilene")
    val nomes3 = arrayListOf("Lukinhas", "Jorge", "George")

    val dicionarioApelidos = mapOf<String, ArrayList<String>>("Joao" to nomes ,
    "Miguel" to nomes1 ,
    "Maria" to nomes2,
    "Lucas" to nomes3 )

    dicionarioDosSonhos.forEach{
        println(it)
    }

    dicionarioApelidos.forEach{
        println(it)
    }
}