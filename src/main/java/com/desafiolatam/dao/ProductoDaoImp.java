package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.conexion.AdministradorConexion;
import com.desafiolatam.model.Producto;



public class ProductoDaoImp implements ProductoDao{
 
	private AdministradorConexion conn = new AdministradorConexion();
	private Connection conexion;
	private PreparedStatement pstm;
	private ResultSet rs;
	@Override
	public Producto BuscarProducto(int id) {
		
		String sql = "SELECT *FROM productos WHERE id_producto = ?";
		Producto producto = new Producto();
		
		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();

			if (rs.next()) {
				producto.setId_producto(rs.getInt("id_producto"));
				producto.setNombre_producto(rs.getString("nombre_producto"));
				producto.setPrecio(rs.getInt("precio"));
				producto.setDescripcion(rs.getString("descripcion"));
				producto.setId_categoria(rs.getInt("id_categoria"));
				
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return producto;
	}

	@Override
	public List<Producto> listarProducto() {
		
		String sql = "SELECT *FROM productos";
		List<Producto> listProducto = new ArrayList<>();
		
		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);
			rs = pstm.executeQuery();

			while(rs.next()) {
				Producto producto = new Producto();
				producto.setId_producto(rs.getInt("id_producto"));
				producto.setNombre_producto(rs.getString("nombre_producto"));
				producto.setPrecio(rs.getInt("precio"));
				producto.setDescripcion(rs.getString("descripcion"));
				producto.setId_categoria(rs.getInt("id_categoria"));
				listProducto.add(producto);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return listProducto;
	}

	@Override
	public boolean agregarProducto(Producto producto) {
		String sql = "INSERT INTO productos (id_producto,nombre_producto,precio,descripcion,id_categoria)" + "VALUES (?,?,?,?,?)";

		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);

			pstm.setInt(1, producto.getId_producto());
			pstm.setString(2, producto.getNombre_producto());
			pstm.setInt(3, producto.getPrecio());
			pstm.setString(4, producto.getDescripcion());
			pstm.setInt(5, producto.getId_categoria());

			int resultado = pstm.executeUpdate();

			if (resultado == 1) {
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean modificarProducto(Producto producto) {
		String sql = "UPDATE productos SET nombre_producto =?,precio =?,descripcion =?,id_categoria =?" + "WHERE id_producto = ?";

		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);

			
			pstm.setString(1, producto.getNombre_producto());
			pstm.setInt(2, producto.getPrecio());
			pstm.setString(3, producto.getDescripcion());
			pstm.setInt(4, producto.getId_categoria());
			pstm.setInt(5, producto.getId_producto());

			int resultado = pstm.executeUpdate();

			if (resultado == 1) {
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean eliminarProducto(int id) {
		String sql = "DELETE FROM productos WHERE id_producto = ?";

		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);

			pstm.setInt(1, id);

			int resultado = pstm.executeUpdate();

			if (resultado == 1) {
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public int obtenerUltimoId() {
		int maximo = 0;
		String sql = "SELECT MAX(id_producto) AS max FROM productos";
		

		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);
			rs = pstm.executeQuery();

			if (rs.next()) {
				maximo = rs.getInt("max");
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return maximo;
	}

}
