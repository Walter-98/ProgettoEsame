package com.esame.OpenWeather.Model;

import java.util.ArrayList;

public class Dati {

	private ArrayList<Metadata> dati= new ArrayList();
	
public Dati(String city,String state) {
		super();
		this.dati=dati;
}

public Dati() {
	super();	
}
public Dati(ArrayList<Metadata>dati) {
	this.dati= dati;	
}
public ArrayList<Metadata> getDati() {
	return dati;
}
public void setDati(ArrayList<Metadata> dati) {
	this.dati = dati;
}

public void addDati(Metadata metadata) {
	metadata.add();
}
@Override
public String toString() {
	return "Dati [dati=" + dati + "]";
}



}