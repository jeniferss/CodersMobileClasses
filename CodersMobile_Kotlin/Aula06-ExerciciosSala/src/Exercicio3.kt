/*
Faça um Programa que peça a altura de 5 pessoas, armazene cada informação num array.
Imprima a altura na ordem inversa a ordem lida.
*/

const val PERGUNTA03 = "Informe a sua altura: "
fun main() {
    val alturasPessoa = ArrayList<Double>()

    for(pessoa in 1..5) {
        print(PERGUNTA03)
        val pessoaAltura = readLine()!!.toDouble()
        alturasPessoa.add(pessoaAltura)
    }
    alturasPessoa.reverse()
    println(alturasPessoa)
}