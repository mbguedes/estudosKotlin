package model

import java.time.LocalDate
import java.time.Period

class Pessoa {
    var nome: String = ""
    var dataNasc: LocalDate = LocalDate.of(1991, 6, 19)
    var peso: Int = 0
    var altura: Double = 0.0
    val idade: Int
        get(){
            return Period.between(dataNasc, LocalDate.now()).years
        }


    fun exibirDados(){
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data de nasciento: $dataNasc")
        println("Idade: $idade anos")
        println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    }

//    fun calcIdade(): Int{
//        var idade = Period.between(dataNasc, LocalDate.now()).years
//        return idade
//    }

}

