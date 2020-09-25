package exercicio7




class CalculoMatematico  {

    fun dividir(num1: Int,num2: Int): Int {
        if (num2 == 0) {
            throw ArithmeticException("A operação não pôde ser realizada")
        } else return num1/num2
    }
}