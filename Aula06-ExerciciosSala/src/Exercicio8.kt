/*
Faça um programa com uma função chamada soma Imposto. A função possui dois parâmetros formais: taxa Imposto, que é a
quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto.
Afunção “altera” o valor de custo para incluir o imposto sobre vendas.
 */

fun main(){
    print(somaImposto(50.0, 100.0))
}

fun somaImposto(taxaImposto: Double, custo: Double ) = custo + (custo * taxaImposto / 100)