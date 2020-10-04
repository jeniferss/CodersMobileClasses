package exercicio3

fun main(){
    val arrayAlunos = ArrayList<Aluno>()

    val aluno1 = Aluno("Hugo", 1020)
    arrayAlunos.add(aluno1)
    val aluno2 = Aluno("Italo", 2010)
    arrayAlunos.add(aluno2)
    val aluno3 = Aluno("Marcia", 2040)
    arrayAlunos.add(aluno3)
    val aluno4 = Aluno("Giovanne", 4020)
    arrayAlunos.add(aluno4)

    val aluno5 = Aluno("Heitor", 2040)
    println(arrayAlunos.contains(aluno5))


}