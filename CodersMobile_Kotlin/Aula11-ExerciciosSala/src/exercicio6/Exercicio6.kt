package exercicio6

fun main(){

    val arrayString: ArrayList<String>? = null

    arrayString?.add("Pato")
    arrayString?.add("Cachorro")
    arrayString?.add("Gato")

    try {
        println(arrayString?.get(3))
    } catch (ex: Exception){
        ex.printStackTrace()
    }

}