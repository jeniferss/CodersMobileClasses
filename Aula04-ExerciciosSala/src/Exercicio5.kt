/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês,sabendo-se que são descontados 11% para o Imposto de Renda,
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Líquido : R$
 */

fun main(){
    print("Quanto você ganha por hora? ")
    val valorHoras = readLine()!!.toDouble()
    print("Quantas horas você trabalhou no mês? ")
    val horasTrabalhadas = readLine()!!.toDouble()
    var salario = valorHoras * horasTrabalhadas
    val salarioInicial = salario
    val descontoIR = salario * 11 / 100
    salario -= descontoIR
    val descontoINSS = salario * 8 / 100
    salario -= descontoINSS
    val descontoSindicato = salario * 5 / 100
    val salarioFinal = salario - descontoSindicato

    println("Salário Bruto : R\$ ${salarioInicial}\n" +
            "- IR (11%) : R\$ ${descontoIR}\n" +
            "- INSS (8%) : R\$ ${descontoINSS}\n" +
            "- Sindicato ( 5%) : R\$ ${descontoSindicato}\n" +
            "= Salário Líquido : R\$ $salarioFinal")

}