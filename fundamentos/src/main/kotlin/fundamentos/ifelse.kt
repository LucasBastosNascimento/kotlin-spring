package fundamentos

fun main(){
    println(parOuImpar(0))
    println(parOuImpar(7))
//    resultadoDaNota(7)
//    resultadoDaNota(4)
//    resultadoDaNota(2)
}

fun parOuImpar(numero: Int): String{
    return if(numero % 2 == 0){
       "Par"
    }else{
       "Impar"
    }

}

//se a nota >= 6 -> passou
//se a nota > 4 -> recuperação
//se a nota < 4 -> reprovou
fun resultadoDaNota(nota:Int){
    if(nota >= 6){
        println("Passou")
    }else if(nota >= 4){
        println("Recuperação")
    }else{
        println("Reprovado")
    }
}