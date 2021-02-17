package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario


fun main(){
    val alice = Analista("Alice Maria", "123.456.789-10",8000.00)
    ImprimeRelatorioFuncionario.imprime(alice)
}
