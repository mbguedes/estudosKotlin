fun enumeradores(args: Array<String>) {

    val tipoDaConta = TipoConta.CORRENTE
    val tipoDaConta2 = TipoConta.POUPANCA
    val tipoDaConta3 = TipoConta.SALARIO

    println(tipoDaConta.nomeConta)
    println(tipoDaConta2.nomeConta)
    println(tipoDaConta3.nomeConta)

}

enum class TipoConta(var nomeConta: String){
    CORRENTE("Corrente"),
    POUPANCA("Poupança"),
    SALARIO("Salário")
}