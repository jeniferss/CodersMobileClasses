/*
Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio
gasto em cada um deles. O usuário deverá informara quantidade de CDs e o valor para em cada um.
 */
import kotlin.math.round

fun main (){

    print("Digite A quantiidade de CDs: ")
    val quantidadeCds = readLine()!!.toInt()

    var count = quantidadeCds
    var somatoriaValorCds = 0.00

    while (count > 0){


        print("Digite o valor do CD número $count : ")
        count--
        val valorCds = readLine()!!.toDouble()
        somatoriaValorCds += valorCds
    }

    val media = round(somatoriaValorCds/quantidadeCds)
    println("O valor médio gasto é de: $media")
}