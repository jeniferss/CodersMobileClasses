package exercicio7

fun main () {
    val calculoDivisao = CalculoMatematico()
    try {
        calculoDivisao.dividir(4, 0)
    }catch (ex: ArithmeticException ){
       print(ex.message)
    }
}




