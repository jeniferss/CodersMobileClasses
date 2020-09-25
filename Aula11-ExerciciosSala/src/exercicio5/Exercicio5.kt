package exercicio5

fun main(){
    val arrayString = ArrayList<String>()

    arrayString.add("Pato")
    arrayString.add("Cachorro")
    arrayString.add("Gato")


    try {
        println(arrayString[3])
    } catch (ex: IndexOutOfBoundsException){
        ex.printStackTrace()
    }
}