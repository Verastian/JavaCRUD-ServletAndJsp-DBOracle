package com.desafiolatam.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AdministradorConexion {

private static Connection conexion = null;
	
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USUARIO ="system";
	private static final String PASSWORD ="oraclevera0908";
	
	private void crearConexion() throws ClassNotFoundException {
		
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL,USUARIO,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public Connection obtenerConexion() throws ClassNotFoundException {
		if(conexion == null) {
			crearConexion();
		}
		return conexion;
	}
}
