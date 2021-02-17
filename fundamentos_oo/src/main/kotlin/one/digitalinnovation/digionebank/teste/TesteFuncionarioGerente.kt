package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val angela = Gerente("Angela Almeida", "123.456.789-10",2000.00, "senha123")
    ImprimeRelatorioFuncionario.imprime(angela)
}
