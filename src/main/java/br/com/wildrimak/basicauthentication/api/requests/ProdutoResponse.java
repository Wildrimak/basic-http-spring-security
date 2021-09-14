package br.com.wildrimak.basicauthentication.api.requests;

import java.math.BigDecimal;

public class ProdutoResponse {

    private String nome;
    private BigDecimal preco;

    public ProdutoResponse(String nome, Long preco) {

	this.nome = nome;
	this.preco = BigDecimal.valueOf(preco);

    }

    public String getNome() {
	return nome;
    }

    public BigDecimal getPreco() {
	return preco;
    }

}
