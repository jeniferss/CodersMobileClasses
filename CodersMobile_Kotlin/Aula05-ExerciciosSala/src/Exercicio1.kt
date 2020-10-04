/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme aletra escrever:
F - Feminino
M - Masculino
Sexo Inválido.
 */

fun main(){

    print("Digite seu Sexo: ")

    when(readLine()!!.toUpperCase()){
        "F" -> println("Feminino")
        "M" -> println("Masculino")
        else -> {
            println("Sexo Inválido")
        }
    }
}