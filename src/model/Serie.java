package model;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {

	private Integer temporadas;
	private Integer numCap;
	private String[] capitulos;

	public Serie() {
		this("", "", 0, 0, 0);
	}

	public Serie(String titulo, String creador, Integer ano, 
	Integer temporadas, Integer numCap) {
		super(titulo, creador, ano);
		setTemporadas(temporadas);
		setNumCap(numCap);
		capitulos = new String[numCap];
		for(int i = 0; i<capitulos.length;i++) {
			capitulos[i] = "" + (i+1);
		}

	}

	public Integer getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Integer temporadas) {
		this.temporadas = temporadas;
	}

	public Integer getNumCap() {
		return numCap;
	}

	public void setNumCap(Integer numCap) {
		this.numCap = numCap;
	}

	public String getCapitulos(Integer pos) {
		return capitulos[pos];
	}

	private void setCapitulos(String[] capitulos) {
		this.capitulos = capitulos;
	}

	public boolean add_capitulo(String nombreCapitulo) {
		boolean added = false;
		for (int i = 0; i < capitulos.length; i++) {
			if (capitulos[i] == null) {
				capitulos[i] = nombreCapitulo;
				added = true;
				break;
			}
		}
		return added;
	}

	public boolean del_capitulo(String nombreCapitulo) {
		boolean deleted = false;
		for (int i = 0; i < capitulos.length; i++) {
			if (capitulos[i] != null && capitulos[i] == nombreCapitulo) {
				capitulos[i] = null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	@Override
	public String play() {
		Integer max = capitulos.length;
		Integer min = 1;
		return "Reproduciendo serie" + getTitulo() + ", capítulo"
				+ getCapitulos((int) (Math.random() * (max - min + 1) + min));
	}

	@Override
	public String stop() {
		Integer max = capitulos.length;
		Integer min = 1;
		return "Parando serie" + getTitulo() + ", capítulo"
				+ getCapitulos((int) (Math.random() * (max - min + 1) + min));
	}

	@Override
	public String pause() {
		Integer max = capitulos.length;
		Integer min = 1;
		return "Pausando serie" + getTitulo() + ", capítulo"
				+ getCapitulos((int) (Math.random() * (max - min + 1) + min));
	}

	@Override
	public String toString() {
		return "\nSerie: "
				+ super.toString()
				+ ", temporadas=" + temporadas 
				+ ", numCap=" + numCap 
				+ ", capitulos=" + Arrays.toString(capitulos);
	}
	
}
