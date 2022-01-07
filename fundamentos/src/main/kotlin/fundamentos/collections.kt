package fundamentos

fun main(){
//    var lista = listOf(1,2,3,4,5,6)

//    var pares = lista.filter { it % 2 == 0 }.first()
//    var impar = lista.filter { it % 2 != 0 }
//    println(pares)
//    println(impar)

//    lista.forEach{
//        println(it)
//    }

// for(numero in lista)   {
//     println(numero)
// }

//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(6))


//    var lista = mutableListOf(1,2,4,9,8,6,5)

//    println(lista)
//
//    lista.add(8)
//    lista.removeAt(0)
//    lista.remove(4)
//    println(lista)
//
//    lista[0]= 30
//    println(lista)

//    println(lista)
//    lista.sort()
//    println(lista)
//
//    lista.shuffle()
//    println(lista)

//    var listaNomes = mutableListOf("Lucas", "Edilaine")
//
//    println(listaNomes)
//
//    listaNomes.sort()
//    println(listaNomes)

//    var setNumeros = setOf(1,2,3)
//    println(setNumeros)

//    var setNumeros = mutableSetOf(1,2,3,4,5)
//    println("Lista set: $setNumeros" )
//
//    println(setNumeros.contains(5))


//    var mapNomesIdade = mapOf("Lucas" to 33,"Mateus" to 32)
    var mapNomesIdade = mutableMapOf("Lucas" to 33,"Mateus" to 32)
    println(mapNomesIdade)

    mapNomesIdade.put("Amora",12)
    println(mapNomesIdade)

    mapNomesIdade.remove("Amora")
    println(mapNomesIdade)

//    mapNomesIdade["Lucas"] =30
//    println(mapNomesIdade)

    mapNomesIdade.putIfAbsent("Lucas",30)
    println(mapNomesIdade)

}