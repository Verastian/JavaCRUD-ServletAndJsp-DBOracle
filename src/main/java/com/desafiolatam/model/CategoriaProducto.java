package com.desafiolatam.model;

public class CategoriaProducto {

	private Producto producto;
	private Categoria categoria;
	
	
	public CategoriaProducto() {
		super();
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "CategoriaProducto [producto=" + producto + ", categoria=" + categoria + "]";
	}
	
	
}
