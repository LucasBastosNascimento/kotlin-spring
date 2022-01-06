package fundamentos

class Carro(var cor: String, val anoFabricacao: Int,val dono: Dono) {

}
data class Dono(var nome: String, var idade: Int){

}
fun main(){
    var carro = Carro("Branco",2021,Dono("Lucas", 33))
    println(carro.cor)
    carro.cor = "vermelho"
    println(carro.cor)
    println(carro.dono.nome)
    carro.dono.nome="Bastos"

    println(carro.dono.nome)
}