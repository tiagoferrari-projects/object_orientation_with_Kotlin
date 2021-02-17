package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val tiago = Pessoa(nome = "Tiago Ferrari", cpf = "123.456.789-10")
    println(tiago.nome)
    println(tiago.cpf)

    val angela = Pessoa("Angela Almeida", "109.876.543-21", BigDecimal.valueOf(2000.00))
    println(angela.nome)
    println(angela.cpf)
    println(angela.salario)
}