package model;

public abstract class Multimedia {

	private String titulo;
	private String creador;
	private Integer anoE;
	private static Integer contador = 0;
	private Integer codigo;
	private boolean terminado;
	
	public Multimedia() {
		this("", "", 0);
		contador++;
		setCodigo(contador);
		setTerminado(false);
	}
	
	public Multimedia(String titulo, String creador, Integer ano) {
		contador++;
		setTitulo(titulo);
		setCreador(creador);
		setAnoE(ano);
		setCodigo(contador);
		setTerminado(false);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public Integer getAnoE() {
		return anoE;
	}
	public void setAnoE(Integer anoE) {
		this.anoE = anoE;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
	public String dar_por_finalizado() {
		String mensaje;
		setTerminado(true);
		mensaje = getTitulo() + "→ Finalizado";
		return mensaje;
	}

	public Integer getCodigo() {
		return codigo;
	}

	private void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return 	"Titulo=" + titulo 
				+ ", Creador=" + creador 
				+ ", Año Estreno=" + anoE 
				+ ", Código=" + codigo
				+ ", Finalizado=" + terminado;
	}
	
	
}
