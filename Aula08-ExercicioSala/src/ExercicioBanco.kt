var newBanco: Banco = Banco()
fun main() {

    //-------------------------------------------------------
    println("Parte 6:")
    val contaPoupanca = ContaPoupanca(0, 0.0, 0.0)
    val contaCorrente = ContaCorrente(1, 200.0, 3.0)

    contaPoupanca.depositar(200.00)
    contaCorrente.depositar(150.00)
    contaPoupanca.sacar(230.00)
    contaCorrente.sacar(80.00)

    val relatorio = Relatorio()
    contaPoupanca.mostrarDados()
    contaCorrente.mostrarDados()
    //--------------------------------------------------------

    menuInicial(newBanco)

}

fun menuInicial(banco: Banco) {

    do {
        println("Escolha uma das seguintes opções: ")
        println("1 : Criar Conta ")
        println("2 : Selecionar Conta ")
        println("3 : Remover Conta ")
        println("4 : Gerar Relatório ")
        println("5 : Finalizar ")
        val resposta = readLine()!!.toInt()


        when (resposta) {
            1 -> criarConta(newBanco)
            2 -> selecionarConta(newBanco)
            3 -> removerConta(newBanco)
            4 -> newBanco.mostrarDados()
            5 -> break

        }
    } while (true)
}

fun criarConta(banco: Banco) {

    println("Escolha o tipo de conta: Poupança ou Corrente")
    val tipoDeConta = readLine()!!.toLowerCase()

    print("Digite o número da conta (ex. 0000000): ")
    val newNumeroConta = readLine()!!.toInt()

    print("Digite o saldo : ")
    val newSaldo = readLine()!!.toDouble()


    if (tipoDeConta.equals("poupança")) {
        print("Digite o limite de crédito: ")
        val newLimiteCredito = readLine()!!.toDouble()

        val newConta = ContaPoupanca(newNumeroConta, newSaldo, newLimiteCredito)
        banco.inserir(newConta)
        println("Operação Realizada com sucesso!")
    }

    if (tipoDeConta.equals("corrente")) {
        print("Digite a taxa de operação: ")
        val newTaxaOperacao = readLine()!!.toDouble()

        val newConta = ContaCorrente(newNumeroConta, newSaldo, newTaxaOperacao)
        banco.inserir(newConta)
        println("Operação Realizada com sucesso!")
    }
}

fun selecionarConta(banco: Banco) {

    print("Digite o número da conta (ex. 0000000): ")
    val numeroConta = readLine()!!.toInt()

    val objetoConta = banco.procurarConta(numeroConta)

    if (objetoConta != null) {

        menuDois(newBanco, objetoConta)

    } else println("Conta inexistente")
}

fun menuDois(banco: Banco, objetoConta: ContaBancaria) {


    println("Escolha uma das seguintes opções: ")
    println("a : Depositar ")
    println("b : Sacar ")
    println("c : Transferir ")
    println("d : Gerar Relatorio ")
    println("e : Retornar ao menu anterior ")
    val resposta2 = readLine()!!.toLowerCase()


    when (resposta2) {

        "a" -> {
            print("Digite o valor: ")
            val newValor = readLine()!!.toDouble()
            objetoConta.depositar(newValor)
        }

        "b" -> {
            print("Digite o valor: ")
            val newValor = readLine()!!.toDouble()
            objetoConta.sacar(newValor)
        }

        "c" -> {

            print("Digite o valor: ")
            val newValor = readLine()!!.toDouble()

            print("Informe a conta para qual deseja transferir (ex. 000000): ")
            val newContaTransferir = readLine()!!.toInt()

            val objetoContaTransferir = banco.procurarConta(newContaTransferir)

            if (objetoContaTransferir != null) {
                objetoConta.transferir(newValor, objetoContaTransferir )
            } else println("Conta Inexistente")
        }

        "d" -> objetoConta.mostrarDados()

        "e" -> menuInicial(newBanco)

    }
}

fun removerConta(banco: Banco) {

    println("Digite o número da conta (ex. 0000000): ")
    val numeroConta = readLine()!!.toInt()

    val objetoConta = banco.procurarConta(numeroConta)

    if (objetoConta != null) {
        banco.remover(objetoConta)
        println("Operação Realizada com sucesso!")
    } else println("Conta inexistente")
}






