package fundamentos

fun main(){
//    val x = 25
//
//    when(x){
//        5, -5 -> println("x == 5")
//        8 -> println("x == 8")
//        9 -> println("x == 9")
//        10 -> {
//            println("x == 10")
//            println("x é uma dezena")
//        }
//        in 11 .. 15 -> println("x esta entre 11 e 15")
//        !in 16 .. 20 -> println("numero não esta no range de 16 a 20")
//        else -> println("numero não mapeado")
//    }
    when {
        comerComOi(5) -> println("5")
        comerComOi("oi, tudo bem") -> println("Oi, vamos sair")
    }
}

fun comerComOi(x: Any): Boolean{
    return when(x){
        is String -> x.startsWith("oi")
        else -> false
    }
}