package br.com.wildrimak.basicauthentication.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wildrimak.basicauthentication.api.requests.FornecedorRequest;
import br.com.wildrimak.basicauthentication.api.responses.FornecedorResponse;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    private List<FornecedorResponse> fornecedores;

    public FornecedorController() {

	this.fornecedores = new ArrayList<>();

	fornecedores.add(new FornecedorResponse("Marizona", "Rua Paraiso Perfeito"));
	fornecedores.add(new FornecedorResponse("Zezão", "Rua Limoeiro Neves"));
   
    }

    @GetMapping
    public List<FornecedorResponse> getFornecedores() {
	return fornecedores;
    }

    @PostMapping
    public FornecedorResponse addFornecedor(@RequestBody FornecedorRequest fornecedorRequest) {

	FornecedorResponse fornecedorResponse = new FornecedorResponse(fornecedorRequest.getNome(),
		fornecedorRequest.getEndereco());

	fornecedores.add(fornecedorResponse);

	return fornecedorResponse;

    }

}
