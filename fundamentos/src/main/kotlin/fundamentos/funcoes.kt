package fundamentos

fun main(){
//    println(retornaNome())
    dizOi(retornaNome(),33)
    dizOi(idade=33,nome = "Dila")
    dizOi("amora")
}

fun retornaNome(): String{
    return "Lucas"
}

fun dizOi(nome:String,idade:Int = 20){
    println("Oi ${nome}, parabéns pelos seu ${idade} anos")
}