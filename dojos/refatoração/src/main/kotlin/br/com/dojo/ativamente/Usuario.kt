package br.com.dojo.ativamente

import java.time.LocalDate

data class Usuario(
    var nome: String,
    var sexo: String,
    var formacao: String,
    var dataNascimento: LocalDate,
    var limiteCartao: Double
)
