fun main(args: Array<String>) {
    /*map/filter/reduce*/
    var numeros = listOf(1, 2, 3, 4, 5)

    var pares = numeros.filter { it % 2 == 0 }

    var impares = numeros.filter { it % 2 != 0 }

    println(pares)
    println(impares)


    var frutas = listOf("morango","abacaxi","limao","laranja","maracuja")
    var frutasM = frutas.filter {
        it.startsWith("M", ignoreCase = true)
    }
    println(frutas)
    println(frutasM)

    var frutasMaiusculas = frutas.map{
        it.uppercase()
    }
    println(frutasMaiusculas)

    var soma = numeros.reduce { atual, prox -> atual + prox }

    println(soma)



}