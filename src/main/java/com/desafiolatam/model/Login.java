package com.desafiolatam.model;

public class Login {
	private String usuario;
	private String password;
	
	
	public Login() {
		super();
	}


	public Login(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Login [usuario=" + usuario + ", password=" + password + "]";
	}
	
	
}
