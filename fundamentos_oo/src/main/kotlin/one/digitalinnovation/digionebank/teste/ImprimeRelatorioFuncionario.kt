package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{           //companon object: metodo estatico, invocar via classe e nao instancia
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}