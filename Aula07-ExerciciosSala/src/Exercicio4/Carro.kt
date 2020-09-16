package Exercicio4

class Carro(var consumoDeCombustivel: Double) {

    var combustivelNoTanque: Double = 0.0

    fun andar(distancia: Double){
        combustivelNoTanque = combustivelNoTanque - (distancia / consumoDeCombustivel )
    }

    fun obterGasolina(){
        println(combustivelNoTanque)
    }

    fun adicionarGasolina(litrosGasolina: Double){
        combustivelNoTanque =  combustivelNoTanque + litrosGasolina
        println(combustivelNoTanque)
    }

}