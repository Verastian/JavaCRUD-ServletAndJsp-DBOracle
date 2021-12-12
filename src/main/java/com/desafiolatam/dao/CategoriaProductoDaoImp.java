package com.desafiolatam.dao;

import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.model.Categoria;
import com.desafiolatam.model.CategoriaProducto;
import com.desafiolatam.model.Producto;

public class CategoriaProductoDaoImp implements CategoriaProductoDao{
	
	private ProductoDao productoDao = new ProductoDaoImp();
	private CategoriaDao categoriaDao = new CategoriaDaoImp();

	@Override
	public List<CategoriaProducto> listarCategoriaProducto() {

		List<CategoriaProducto> lista = new ArrayList<>();
		List<Producto> listaProductos = productoDao.listarProducto();
		
		for (Producto p : listaProductos) {
			Categoria c = categoriaDao.buscarCategoria(p.getId_categoria());
			
			CategoriaProducto cP = new CategoriaProducto();
			cP.setCategoria(c);
			cP.setProducto(p);
			
			lista.add(cP);
		}
		
		return lista;
	}

}
