/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar orendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que oestabelecido pelo regulamento de pesca do estado de
São Paulo (50 quilos) deve pagaruma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa queleia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso aquantidade de quilos  além do limite e na variável multa o valor da multa que João deverá
pagar. Imprima os dados do programa com as mensagens adequadas.
 */
fun main() {
    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()
    var excesso =  peso - 50
    var multa =  excesso * 4
    println()
    println("Excedeu " + excesso + "Kg")
    println("O valor a ser pago é de R\$ $multa")
}