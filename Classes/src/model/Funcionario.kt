package model


class Funcionario: Pessoa() {

    var cargo: String = ""
    var salario: Double = 0.0

    override fun exibirDados(){
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data de nasciento: $dataNasc")
        println("Idade: $idade anos")
        println("Salário: $salario reais")
        println("Cargo: $cargo ")
        println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    }

}