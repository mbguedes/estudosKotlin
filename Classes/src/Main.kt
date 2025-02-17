import java.time.LocalDate
import model.Pessoa


fun main(args: Array<String>) {

    val pessoa = Pessoa()
    pessoa.nome = "Marcio"
    pessoa.altura = 1.93
    pessoa.peso = 110
    pessoa.dataNasc = LocalDate.of(1991, 6, 19)

    val pessoa2 = Pessoa()
    pessoa2.nome = "Amanda"
    pessoa2.altura = 1.60
    pessoa2.peso = 60
    pessoa2.dataNasc = LocalDate.of(1995, 2, 9)

    pessoa.exibirDados()
    pessoa2.exibirDados()
}