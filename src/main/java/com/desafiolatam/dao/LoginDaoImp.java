package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.desafiolatam.conexion.AdministradorConexion;




public class LoginDaoImp implements LoginDao{
	private AdministradorConexion conn = new AdministradorConexion();
	private Connection conexion;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	@Override
	public boolean usuarioRegistrado(String correo, String password) {

		boolean usuarioExiste = false;
		 String sql = "SELECT * FROM login WHERE usuario = '" +correo + "'" + "AND password = '" + password + "'";
		
		 try {
			 conexion = conn.obtenerConexion();
				pstm = conexion.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				usuarioExiste = true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return usuarioExiste;
	}


}
