package controller;

import java.util.Arrays;

import model.*;

public class Catalogo {

	private Multimedia[] catalogo;

	public Catalogo(Integer tamano) {
		catalogo = new Multimedia[tamano];
	}

	public void add_multimedia(Multimedia elemento) {
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] == null) {
				catalogo[i] = elemento;
				break;
			}
		}
	}
	public void del_multimedia(Multimedia elemento) {
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] == elemento) {
				catalogo[i] = null;
				break;
			}
		}
	}
	public void ordenar_por_id() {
		Arrays.sort(catalogo, new sort_id());
	}
	public void ordenar_por_titulo() {
		Arrays.sort(catalogo, new sort_titulo());
	}
	public void ordenar_por_anyo() {
		Arrays.sort(catalogo, new sort_anyo());
	}
	public Integer numero_de_elementos() {
		return catalogo[0].getCodigo();
	}
	

	public Multimedia[] getCatalogo() {
		return catalogo;
	}
	public Multimedia getCatalogo(int i) {
		return catalogo[i];
	}

	public void setCatalogo(Multimedia[] catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		return "\nCatalogo " + Arrays.toString(catalogo);
	}
	
	
}
