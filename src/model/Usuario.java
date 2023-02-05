package model;

public class Usuario {

	private String nombreUsuario;
	private String contraseña;
	
	public Usuario() {
		this("","");
	}
	public Usuario(String n, String c) {
		setNombreUsuario(n);
		setContraseña(c);
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", contraseña=" + contraseña + "]";
	}
	
	
}
