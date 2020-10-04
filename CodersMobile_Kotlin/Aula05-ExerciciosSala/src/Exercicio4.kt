/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar aousuário a valor do saque
e depois informar quantas notas de cada valor serãofornecidas. As notas disponíveis serão as
de 1, 5, 10, 50 e 100 reais.  O valor mínimo é de 10 reais e o máximo de 600 reais.
O programa não deve se preocuparcom a quantidade de notas existentes na máquina.
 */

fun main(){

    print("Digite o valor do saque: ")
    val valorSaque = readLine()!!.toInt()
    var valorRestante: Int

    val valorSaqueMinimo = 10
    val valorSaqueMaximo = 600


    if(valorSaque in valorSaqueMinimo..valorSaqueMaximo){
        val notasDe100 = valorSaque / 100
        println("notas de 100: $notasDe100")
        valorRestante = valorSaque % 100

        if(valorRestante != 0){
            val notasDe50 = valorRestante / 50
            println("notas de 50: $notasDe50")
            valorRestante %= 50
        }

            if(valorRestante != 0){
                val notasDe10 = valorRestante / 10
                println("notas de 10: $notasDe10")
                valorRestante %= 10
            }

                if(valorRestante != 0){
                    val notasDe5 = valorRestante / 5
                    println("notas de 5: $notasDe5")
                    valorRestante %= 5
                }

                    if(valorRestante != 0){
                        val notasDe1 = valorRestante / 1
                        println("notas de 1: $notasDe1")
                    }
    } else {
        println("Valor para saque inválido")
    }
}