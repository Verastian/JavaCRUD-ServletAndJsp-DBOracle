package com.desafiolatam.model;

public class Producto {

	private int id_producto;
	private String nombre_producto;
	private int precio;
	private String descripcion;
	private int id_categoria;
	
	
	public Producto() {
		super();
	}

	

	public Producto(int id_producto, String nombre_producto, int precio, String descripcion, int id_categoria) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.precio = precio;
		this.descripcion = descripcion;
		this.id_categoria = id_categoria;
	}



	public int getId_producto() {
		return id_producto;
	}


	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}


	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio=" + precio
				+ ", descripcion=" + descripcion + ", id_categoria=" + id_categoria + "]";
	}
	
	
	
}
