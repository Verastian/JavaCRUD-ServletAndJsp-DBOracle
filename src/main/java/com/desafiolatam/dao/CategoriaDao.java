package com.desafiolatam.dao;

import java.util.List;

import com.desafiolatam.model.Categoria;

public interface CategoriaDao {

	public Categoria buscarCategoria(int id);
	public List<Categoria> listaCategoria();
}
