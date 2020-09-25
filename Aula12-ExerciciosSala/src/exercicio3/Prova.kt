package exercicio3

class Prova {
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>){
        var soma = 0
        for (i in conjuntoDeInteiros){
            soma += i
        }
        println("O resultado da soma é: $soma")
    }
}