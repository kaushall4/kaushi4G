package Buch;

import java.util.ArrayList;

public class Bibliothek {
	private String name = "Bib1";
	public ArrayList<Buch> buecher = new ArrayList<Buch>();
	private static Bibliothek bibliothek = null;
	
	public static Bibliothek getBibliothek() {
		if (bibliothek == null) {
			bibliothek = new Bibliothek();
		}
		return bibliothek;
	}

	public ArrayList<Buch> getBuecher() {
		return buecher;
	}

	public void setBuecher(ArrayList<Buch> buecher) {
		this.buecher = buecher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


