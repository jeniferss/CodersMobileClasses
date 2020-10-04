package exercicio3

fun main(){

    val setList = mutableSetOf<Int>(0, 2, 4, 6, 8, 10)
    val provaP1 = Prova()

    provaP1.somaTotal(setList)
    print("Os numeros envolvidos na soma foram:")

    setList.forEach{
        print(" $it")
    }
}