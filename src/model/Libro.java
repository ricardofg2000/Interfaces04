package model;

public class Libro extends Multimedia{
	
	private String editorial;
	private String ISBN;
	private Integer numPag;
	
	public Libro(){
		this("","", 0, "", "", 0);
	}
	
	public Libro(String titulo, String creador, Integer ano, String editorial,
			String ISBN, Integer numPag) {
		super(titulo, creador, ano);
		setEditorial(editorial);
		setISBN(ISBN);
		setNumPag(numPag);
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Integer getNumPag() {
		return numPag;
	}

	public void setNumPag(Integer numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "\nLibro: "
				+ super.toString()
				+ ", teditorial=" + editorial 
				+ ", ISBN=" + ISBN 
				+ ", numPag=" + numPag;
	}
	

}
