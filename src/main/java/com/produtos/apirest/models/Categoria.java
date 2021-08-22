package com.produtos.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="TB_CATEGORIA")
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nomecategoria;
	
	@OneToMany
	private List<Produto> produto;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNomecategoria() {
		return nomecategoria;
	}
	
	public void setNomecategoria(String nomecategoria) {
		this.nomecategoria = nomecategoria;
	}

}
