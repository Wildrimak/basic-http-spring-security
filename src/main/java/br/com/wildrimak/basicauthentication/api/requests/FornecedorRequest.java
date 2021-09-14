package br.com.wildrimak.basicauthentication.api.requests;

public class FornecedorRequest {

    private String nome;
    private String endereco;
    private String descricao;

    public FornecedorRequest(String nome, String endereco, String descricao) {

	this.nome = nome;
	this.endereco = endereco;
	this.descricao = descricao;

    }

    public String getNome() {
	return nome;
    }

    public String getEndereco() {
	return endereco;
    }

    public String getDescricao() {
	return descricao;
    }

}
