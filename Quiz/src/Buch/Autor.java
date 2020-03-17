package Buch;

import java.util.Date;

public class Autor {
private String name;
public Autor(String name, String vorname, Date geburtsdatum) {
	super();
	this.name = name;
	this.vorname = vorname;
	this.geburtsdatum = geburtsdatum;
}
private String vorname;
private Date geburtsdatum;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVorname() {
	return vorname;
}
public void setVorname(String vorname) {
	this.vorname = vorname;
}
public Date getGeburtsdatum() {
	return geburtsdatum;
}
public void setGeburtsdatum(Date geburtsdatum) {
	this.geburtsdatum = geburtsdatum;
}


}
