package fundamentos

fun main(){
    val pessoa: Pessoa? = Pessoa("lucas",33)

    println(pessoa!!.nome)
}