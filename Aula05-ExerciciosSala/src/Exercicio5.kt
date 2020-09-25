/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoano crime.
Se a pessoa responder positivamente a 2 questões ela deve serclassificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
Use “S” para sim e “N” para não.
 */

fun main(){

    var pontuacao = 0

    print("Telefonou para a vítima? ")
    val pergunta1 = readLine()!!.toUpperCase()

    if(pergunta1 == "S"){
        pontuacao++
    }

    print("Esteve no local do crime? ")
    val pergunta2 = readLine()!!.toUpperCase()

    if(pergunta2 == "S"){
        pontuacao++
    }

    print("Mora perto da vítima? ")
    val pergunta3 = readLine()!!.toUpperCase()

    if(pergunta3 == "S"){
        pontuacao++
    }

    print("Devia para a vítima? ")
    val pergunta4 = readLine()!!.toUpperCase()

    if(pergunta4 == "S"){
        pontuacao++
    }

    print("Já trabalhou com a vítima? ")
    val pergunta5 = readLine()!!.toUpperCase()

    if(pergunta5 == "S"){
        pontuacao++
    }

    when(pontuacao){
        2 -> println("Suspeita")
        3,4 -> println("Cúmplice")
        5 -> println("Assassino")
        else -> {
            println("Inocente")
        }
    }
}

