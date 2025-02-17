import java.time.LocalDate
import model.Pessoa
import model.Funcionario


fun main(args: Array<String>) {

    var funcionario = Funcionario()
    funcionario.nome = "Marcio"
    funcionario.dataNasc = LocalDate.of(1991,6,19)
    funcionario.cargo = "Dev Android"
    funcionario.salario = 15000.00

    funcionario.exibirDados()
}