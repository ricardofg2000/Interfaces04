package model;

import java.util.Arrays;

public class Cuentas {

	private Usuario[] cuentas;
	private static Integer cont = 0;
	
	public Cuentas() {
		cuentas = new Usuario[5];
	}

	public Usuario[] getCuentas() {
		return cuentas;
	}

	public void setUsuario(Usuario[] cuenta) {
		this.cuentas = cuenta;
	}
	
	public boolean inicioSesion(Usuario usuario) {
		boolean isOK=false;
		for(int i =0; i<cuentas.length;i++) {
			if (usuario.getNombreUsuario().equals(cuentas[i].getNombreUsuario()) &&
					usuario.getContraseña().equals(cuentas[i].getContraseña())) {
				isOK = true;
				break;
			} 
		}
		return isOK;
	}
	
	public void addCuenta(Usuario usuario) {
		cuentas[cont++] = usuario;
	}

	@Override
	public String toString() {
		return "Cuentas [cuentas=" + Arrays.toString(cuentas) + "]";
	}

	
}
