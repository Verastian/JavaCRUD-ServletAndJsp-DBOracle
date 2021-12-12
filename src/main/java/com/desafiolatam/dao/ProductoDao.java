package com.desafiolatam.dao;

import java.util.List;

import com.desafiolatam.model.Producto;

public interface ProductoDao {

	public Producto BuscarProducto(int id);
	public List <Producto> listarProducto();
	public boolean agregarProducto(Producto producto);
	public boolean modificarProducto(Producto producto);
	public boolean eliminarProducto(int id);
	public int obtenerUltimoId();
}
