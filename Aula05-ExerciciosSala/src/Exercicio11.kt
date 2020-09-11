/*
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'
*/

fun main(){

    do {
        print("Digite um nome: ")
        val nomeCaracteres = readLine()!!.length

        if(nomeCaracteres > 3){
            println("Válido")
        } else {
            println("Digite um nome válido")
            continue
        }

        do {
            print("Digite uma idade: ")
            val idade = readLine()!!.toInt()

            if (idade in 1 until 150) {
                println("Válido")
                break
            } else {
                println("Digite uma idade válida")
                continue
                }
        }while(true)

            do {
                print("Digite um salario: ")
                val salario = readLine()!!.toInt()

                    if (salario > 0) {
                        println("Válido")
                        break
                } else {
                    println("Digite um salário válido")
                    continue
                }
            }while(true)

                do {
                    print("Digite seu sexo: ")
                    val sexo = readLine()!!.toLowerCase()

                    if (sexo == "f" || sexo == "m") {
                        println("Válido")
                        break
                    } else {
                        println("Digite um sexo válido")
                        continue
                    }
                }while(true)


                    do {
                        print("Digite seu Estado Civil: ")

                        when (readLine()!!.toLowerCase()) {
                            "s", "c", "v", "d" -> println("Válido")
                            else -> {
                                println("Digite um Estado Civil válido")
                                continue
                            }
                        }
                        break
                    }while(true)
        break
    } while(true)
}




