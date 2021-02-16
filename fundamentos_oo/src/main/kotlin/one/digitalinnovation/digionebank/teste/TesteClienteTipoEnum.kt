package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento -> println("${elemento.name} - ${elemento.descricao}") }

    ClienteTipo.values().forEach { it:ClienteTipo -> println("${it.name} - ${it.descricao}") }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}