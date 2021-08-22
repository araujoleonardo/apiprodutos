package com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Categoria;
import com.produtos.apirest.repository.CategoriaRepository;

@RestController
@RequestMapping(value="/api")
public class CategoriaResource {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	@GetMapping("/categoria")
	public List<Categoria> listaCategoria(){
		return categoriaRepository.findAll();
	}
	

}
