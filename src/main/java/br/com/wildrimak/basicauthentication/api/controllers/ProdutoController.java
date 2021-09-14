package br.com.wildrimak.basicauthentication.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wildrimak.basicauthentication.api.responses.ProdutoResponse;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<ProdutoResponse> produtos = Arrays.asList(new ProdutoResponse("notebook", 4000L),
	    new ProdutoResponse("smartphone", 8000L));

    @GetMapping
    public List<ProdutoResponse> getProdutos() {
	return produtos;
    }
    
    @GetMapping
    @RequestMapping("/{idProduto}")
    public ProdutoResponse getDetalheProduto(@PathVariable Integer idProduto) {
	return produtos.get(idProduto-1);
    }

}
