package com.esame.Nuvolosita.Model;

import java.util.ArrayList;
import java.util.List;

public class Metadata {
	protected  String city;
	protected  String state;
	//private  String country;

	public Metadata() {
		
	}
	
	public Metadata(String city,String state/*String country*/) {
		super();
		this.city = city;
		this.state = state;
	//	this.country = country;
	}
	
	public  String getCity() {
		return city;
	}
	public  void setCity(String city) {
		this.city = city;
	}
	public  String getState() {
		return state;
	}
	public void setState(String state) {
		String[] codes = java.util.Locale.getISOLanguages();
		for(int i=0;i<codes.length;i++) {
		if(getState()==codes[i])
			 this.state = state;
		else
			System.out.print("Inserire rispetto ad ISO3166-alpha2");
		}	
	}
	@Override
	public String toString() {
		return String.format(
				"Course [city=%s, state=%s, ]", city, state);
}
}