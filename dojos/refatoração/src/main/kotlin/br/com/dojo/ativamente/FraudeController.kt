package br.com.dojo.ativamente

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController()
@RequestMapping("v1/controle-fraude")
class FraudeController {

    @PostMapping
    private fun controleFraude(@RequestBody compra: Compra): RetornoAvaliacao {
        return avaliarCompra(compra)
    }

    private fun avaliarCompra(compra: Compra): RetornoAvaliacao {
        var valorCompra: Double = 0.0
        var idade: Int = 0
        val produtosVisadosFraudes = listOf("Notebook", "HD Externo", "Monitor", "Smartphone", "TekPix")
        val data = LocalDate.now()

        idade = data.year - compra.usuario.dataNascimento.year
        System.out.println(idade)

        if ((compra.usuario.sexo.equals("Masculino") || compra.usuario.sexo.equals("masculino")) && idade >= 30) {
            System.out.println("Fraude")
        } else {
            return RetornoAvaliacao("Enviado para sistema de confirmação de compra")
        }

        if (compra.usuario.formacao.contains("contabil") || compra.usuario.formacao.contains("Contabil")) {
            System.out.println("Fraude")
        } else {
            return RetornoAvaliacao("Enviado para sistema de confirmação de compra")
        }

        if (compra.usuario.limiteCartao >= 100000) {
            System.out.println("Fraude")
        } else {
            return RetornoAvaliacao("Enviado para sistema de confirmação de compra")
        }

        for (produto in compra.produtos) {
            if (produtosVisadosFraudes.contains(produto.nome)) {
                break
            }
        }

        for (produto in compra.produtos) {
            valorCompra += produto.valor
        }

        if (valorCompra >= 5000) {
            System.out.println("Fraude")
        } else {
            return RetornoAvaliacao("Enviado para sistema de confirmação de compra")
        }

        return RetornoAvaliacao("Fraude, compra negada!")
    }
}