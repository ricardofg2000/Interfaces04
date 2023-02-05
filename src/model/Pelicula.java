package model;

public class Pelicula extends Multimedia implements Reproducible{

	private Integer duracion;
	private String productora;
	private String pais;
	
	public Pelicula() {
		this("","", 0, 0, "", "");
	}
	public Pelicula(String titulo, String creador, Integer ano, 
			Integer duracion, String productora, String pais) {
		super(titulo, creador, ano);
		setDuracion(duracion);
		setProductora(productora);
		setPais(pais);
		
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String play() {
		return "Reproduciendo serie" + getTitulo();
	}

	@Override
	public String stop() {
		return "Parando serie" + getTitulo();
	}

	@Override
	public String pause() {
		return "Pausando serie" + getTitulo();
	}
	@Override
	public String toString() {
		return "\nPelicula: "
				+ super.toString() 
				+ ", Duracion=" + duracion 
				+ ", Productora=" + productora 
				+ ", Pais=" + pais;
	}
	
	
}
