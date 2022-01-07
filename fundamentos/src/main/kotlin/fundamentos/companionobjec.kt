package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    companion object {
        fun criarComValoresPadrao(): MinhaClasse{
            return MinhaClasse("Lucas","Av.paiol",30)
        }

        fun criarAPartirdeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse{
            return MinhaClasse(segundaClasse.nome,segundaClasse.endereco,segundaClasse.idade)
        }
    }
}
class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criarComValoresPadrao(): SegundaClasse{
        return SegundaClasse("Dila","Av.paiol",30)
    }
}
fun main(){
    var segundaClasse = SegundaClasse("Dila","Av.paiol",30).criarComValoresPadrao()

    var minhaClasse = MinhaClasse.criarAPartirdeSegundaClasse(segundaClasse)
}