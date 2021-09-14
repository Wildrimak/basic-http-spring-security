package br.com.wildrimak.basicauthentication.api.responses;

public class FornecedorResponse {

    private String nome;
    private String endereco;

    public FornecedorResponse(String nome, String endereco) {

	this.nome = nome;
	this.endereco = endereco;

    }

    public String getNome() {
	return nome;
    }

    public String getEndereco() {
	return endereco;
    }

}
