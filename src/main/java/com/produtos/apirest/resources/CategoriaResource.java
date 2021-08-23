package com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Categoria;
import com.produtos.apirest.repository.CategoriaRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/api")
public class CategoriaResource {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping("/categoria")
	public List<Categoria> listaCategoria(){
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/categoria/{id}")
	public Categoria listaCategoriaUnica(@PathVariable(value="id") long id){
		return categoriaRepository.findById(id);
	}
	
	@PostMapping("/categoria")
	public Categoria salvaCategoria(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	@DeleteMapping("/categoria")
	public void deletaCategoria(@RequestBody Categoria categoria) {
		categoriaRepository.delete(categoria);
	}
	
	@PutMapping("/categoria")
	public Categoria atualizaCategoria(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

}
