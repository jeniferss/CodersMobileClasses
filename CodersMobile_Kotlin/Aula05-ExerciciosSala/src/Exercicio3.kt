/*
Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada
por aluno e apresentar a mensagem:
"Aprovado", se a média alcançada for maior ou igual a sete;
"Reprovado", se a média for menor do que sete;
"Aprovado com Distinção", se a média for igual a dez.
 */

fun main(){

    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    val quantidadeNotas = 2
    val media = (nota1 + nota2) / quantidadeNotas
    val mediaMaxima = 10.00
    val mediaMinima = 7.00

    if(media == mediaMaxima){
        println("Aprovado com Dinstinção!")
    } else if (media >= mediaMinima){
        println("Aprovado!")
    } else {
        println("Reprovado")
    }
}