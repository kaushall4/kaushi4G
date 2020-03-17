package Buch;

import java.util.ArrayList;



public class Bibliothek {
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Buch> getList() {
		return list;
	}
	public void setList(ArrayList<Buch> list) {
		this.list = list;
	}
	private ArrayList<Buch> list = new ArrayList<Buch>();
	private String name;
	public static Bibliothek bibliothek=null;
	
	//singleton Pattern
	public static Bibliothek getBibliothek()
	{
		if (bibliothek == null)
			bibliothek = new Bibliothek
	}


}
