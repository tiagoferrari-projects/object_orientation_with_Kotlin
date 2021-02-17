package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val tiago = Cliente(
        nome = "Tiago Ferrari",
        cpf = "123.456.789-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456")

    println(tiago)
    TesteAutenticacao().autentica(tiago)
}



