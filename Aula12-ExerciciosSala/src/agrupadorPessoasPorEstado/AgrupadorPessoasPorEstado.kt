package agrupadorPessoasPorEstado

fun main(){

    val pessoa1 = Pessoa("Jenifer", Estado("SP", "São Paulo"))

    val pessoa2 = Pessoa("Vallentina", Estado("RJ", "Rio de Janeiro"))

    val pessoa3 = Pessoa("Enzo", Estado("SC", "Santa Catarina"))

    val pessoa4 = Pessoa("Ana", Estado("BA", "Bahia"))

    val pessoa5 = Pessoa("Jane", Estado("BA", "Bahia"))

    val pessoa6 = Pessoa("Catarina", Estado("BA", "Bahia"))

    val pessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6)

    val pessoasAgrupadas = mutableMapOf<String, List<Pessoa>>()

    println(pessoas.groupBy { it.estado.sigla })
}
