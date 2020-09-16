package Exercicio3

fun main (){
    val atleta = Atleta("José", 5, 8)

    val prova = Prova(2, 4)
    val prova0 = Prova(8, 10)
    val prova1 = Prova(5, 2)

    val atleta0 : Atleta = Atleta("Diniz", 8, 4)

    val prova2 = Prova(5, 10)
    val prova3 = Prova(6, 8)
    val prova4 = Prova(3, 1)

    println(prova.realizarProva(atleta))
    println(prova0.realizarProva(atleta))
    println(prova1.realizarProva(atleta))
    println("--------------------------")
    println(prova2.realizarProva(atleta0))
    println(prova3.realizarProva(atleta0))
    println(prova4.realizarProva(atleta0))


}