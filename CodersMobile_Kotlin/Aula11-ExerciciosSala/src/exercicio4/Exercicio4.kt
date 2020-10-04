package exercicio4

fun main(){
    val arrayFuncionarios = ArrayList<Funcionario>()

    val funcionario1 = Funcionario("Jenifer", 1010)
    arrayFuncionarios.add(funcionario1)
    val funcionario2 = Funcionario("Vinicius", 2020)
    arrayFuncionarios.add(funcionario2)
    val funcionario3 = Funcionario("Gustavo", 3030)
    arrayFuncionarios.add(funcionario3)
    val funcionario4 = Funcionario("Laura", 4040)
    arrayFuncionarios.add(funcionario4)

    val funcionario5 = Funcionario("Rafael", 2020)
    println(arrayFuncionarios.contains(funcionario5))
}