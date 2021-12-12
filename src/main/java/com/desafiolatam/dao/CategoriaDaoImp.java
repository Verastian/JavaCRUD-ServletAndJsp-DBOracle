package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.conexion.AdministradorConexion;
import com.desafiolatam.model.Categoria;


public class CategoriaDaoImp implements CategoriaDao {

	private AdministradorConexion conn = new AdministradorConexion();
	private Connection conexion;
	private PreparedStatement pstm;
	private ResultSet rs;

	@Override
	public Categoria buscarCategoria(int id) {
		System.out.println(id);
		String sql = "SELECT * FROM categorias WHERE id_categoria = ?";
		Categoria categoria = new Categoria();

		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();

			if (rs.next()) {
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNombre_categoria(rs.getString("nombre_categoria"));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		return categoria;
	}

	@Override
	public List<Categoria> listaCategoria() {
		System.out.println("listaCategoria");
		String sql = "SELECT * FROM categorias";
		List<Categoria> listCategoria = new ArrayList<>();

		try {
			conexion = conn.obtenerConexion();
			pstm = conexion.prepareStatement(sql);
			rs = pstm.executeQuery();

			while(rs.next()) {
				Categoria categoria = new Categoria();
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNombre_categoria(rs.getString("nombre_categoria"));
				listCategoria.add(categoria);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		return listCategoria;
	}

}
