package br.com.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.controllers.model.Produto;
import br.com.loja.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> listar() {
		return produtoRepository.findAll();
	}
	
	@PostMapping
	public Produto adicionar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
}
