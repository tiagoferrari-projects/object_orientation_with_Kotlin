package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista

fun main(){
    val angela = Analista("Angela Almeida", "123.456.789-10",2000.00)
    ImprimeRelatorioFuncionario.imprime(angela)
}
