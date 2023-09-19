package org.exeptions.java.books;

public class Libro {

	
	private String titolo;
	private int numPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int numPagine, String autore, String editore) throws Exception {
		
		setTitolo(titolo);
		setPagine(numPagine);
		setAutore(autore);
		setEditore(editore);
		
	}
	
	//----------------------------- titolo ----------------------------//
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) throws Exception {
		if (titolo.isBlank())
			throw new Exception("Il Titolo non può essere vuoto");
		
		this.titolo = titolo;
	}
	
	//----------------------------- pagine ----------------------------//
	
	public int getPagine() {
		return numPagine;
	}
	
	public void setPagine(int numPagine) throws Exception {
		
		if (numPagine <= 0 )
			throw new Exception("Il Numero di Pagine non può essere 0 inferiore");
		
		this.numPagine = numPagine;
	}
	
	//----------------------------- autore ----------------------------//
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) throws Exception {
		if (autore.isBlank())
			throw new Exception("L'Autore non può essere assente");
		
		this.autore = autore;
	}
	
	//----------------------------- editore ----------------------------//
	
	public String getEditore() {
		return editore;
	}
	
	public void setEditore(String editore) throws Exception {
		if (editore.isBlank())
			throw new Exception("L'Editore non può essere assente");
		
		this.editore = editore;
	}
	
	public String fullData(){
		return getTitolo() + "\n"
				+getPagine() + "\n"
				+getAutore() + "\n"
				+getEditore() + "\n";
	}
	
	@Override
	public String toString() {
		
		return getTitolo() + "\n"
				+ getPagine() +"\n"
				+ getAutore() +"\n"
				+ getEditore() +"\n";
				
	}
	
	
	
	
}
