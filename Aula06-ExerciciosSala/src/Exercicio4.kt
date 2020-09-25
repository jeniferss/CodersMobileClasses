/*
Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete feita a um grande quantidade de organizações:
"Qual o melhor Sistema Operacional para uso em servidores?"As possíveis respostas são:
1- Windows Server
2- Unix
3- Linux
4- Netware
5- Mac OS
6- Outro

Você foi contratado para desenvolver um programa que leia o resultado da enquete e informe ao final o resultado da mesma.
O programa deverá ler os valores até ser informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos
valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma das opções devem ser armazenados
num vetor. Após os dados terem sido completamente informados, o programa deverá calcular a percentual de cada um
dos concorrentes e informar o vencedor da enquete. O formato da saída foi dadopela empresa, e é o seguinte:

Sistema Operacional     Votos   %
-------------------     -----   ---
Windows Server           1500   17%
Unix                     3500   40%
Linux                    3000   34%
Netware                   500    5%
Mac OS                    150    2%
Outro                     150    2%
-------------------     -----
Total                    8800O
Sistema Operacional mais votado foi o Unix, com 3500 votos,correspondendo a 40% dos votos.

 */

const val PERGUNTA04 =
    "Qual o melhor Sistema Operacional para uso em servidores? As possíveis respostas são: \n1- Windows Server \n2- Unix \n3- Linux \n4- Netware \n5- Mac OS \n6- Outro"

val arraySO = arrayOf("Windows Server", "Unix", "Linux ", "Netware ", "Mac OS", "Outro")
var votosSO = arrayListOf(0, 0, 0, 0, 0, 0)
var percentualSO = ArrayList<Double>()
var votos = 0
var percentual: Int = 0
const val CABECALHO = "Sistema Operacional     Votos   %"


fun main() {
    println(PERGUNTA04)
    receberSomar()
    calcularPercentual()
    mostrarResultado()
}

fun receberSomar() {
    do {
        val resposta = readLine()!!.toInt()

        if (resposta == 0) break
        if (resposta in 1..6) {
            votosSO[resposta - 1]++
            votos++
        } else {
            println("Voto Inválido")
            continue
        }
    } while (true)
}

fun calcularPercentual() {

    for (i in 0..5) {
        percentual = votosSO[i] * 100 / votos
        percentualSO.add(percentual.toDouble())
    }
}

fun vencedor(): String {
    var maisVotos = 0
    var h = 0
    for (x in 0..5)
        if (votosSO[x] > maisVotos) {
            maisVotos = votosSO[x]
            h = x
        }
    return "Sistema Operacional mais votado foi o ${arraySO[h]}, com ${votosSO[h]} votos, correspondendo a ${percentualSO[h]}% dos votos"
}

fun mostrarResultado() {
    println(CABECALHO)
    println("--------------------   ------ ---")
    for (i in 0..5) {
        println("${arraySO[i]}                   ${votosSO[i]} ${percentualSO[i]}")
    }
    println("-----------------------------------------------------")
    println(vencedor())

}







