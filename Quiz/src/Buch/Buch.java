package Buch;

public class Buch {
	
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getSeiten() {
		return seiten;
	}
	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}
	public String getKategorie() {
		return kategorie;
	}
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Buch(int seiten, String kategorie,  String titel,Autor autor) {
		super();
		this.seiten = seiten;
		this.kategorie = kategorie;
		this.autor = autor;
		this.titel = titel;
	}
	private String kategorie;
	private Autor autor;
	private String titel;
	private int seiten;

}
