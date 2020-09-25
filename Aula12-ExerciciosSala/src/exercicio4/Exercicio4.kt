package exercicio4


fun main(){

    val pertencesA = mutableListOf<Peca>(Pertence("MarcaA1", "ModeloA1"), Pertence("MarcaA2", "ModeloA2"))
    val pertencesB = mutableListOf<Peca>(Pertence("MarcaB1", "ModeloB1"), Pertence("MarcaB2", "ModeloB2"))

    val newGuardaVolume = GuardaVolume()

    val identificadorB = newGuardaVolume.guardar(pertencesB)

    val identificadorA = newGuardaVolume.guardar(pertencesA)

    println(newGuardaVolume.dicionario)
    newGuardaVolume.devolverPecas(identificadorA)
    newGuardaVolume.devolverPecas(identificadorB)
    println(newGuardaVolume.dicionario)

}