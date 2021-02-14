package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Tiago"

    var cpf: String = "123.456.789-10"
    private set

    }

fun main(){
    val tiago = Pessoa()

    println(tiago)
    println(tiago.nome)
    println(tiago.cpf)

}