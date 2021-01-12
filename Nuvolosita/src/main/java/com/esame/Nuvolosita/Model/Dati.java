package com.esame.Nuvolosita.Model;

import java.util.List;

public class Dati {
 
	protected float coordinate;
	protected String base;
	protected List<Object> weather;
	protected float main;
	protected float visibility;
	protected float wind;
	protected float clouds;
	protected float dt;
	protected List<Object>sys;
	protected float timezone;
	protected int id;
	protected String name;
	protected int cod;
	
	public Dati(float coordinate, String base, List<Object> weather, float main, float visibility, float wind,
			float clouds, float dt, List<Object> sys, float timezone, int id, String name, int cod) {
		super();
		this.coordinate = coordinate;
		this.base = base;
		this.weather = weather;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}
	
	public float getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(float coordinate) {
		this.coordinate = coordinate;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public List<Object> getWeather() {
		return weather;
	}
	public void setWeather(List<Object> weather) {
		this.weather = weather;
	}
	public float getMain() {
		return main;
	}
	public void setMain(float main) {
		this.main = main;
	}
	public float getVisibility() {
		return visibility;
	}
	public void setVisibility(float visibility) {
		this.visibility = visibility;
	}
	public float getWind() {
		return wind;
	}
	public void setWind(float wind) {
		this.wind = wind;
	}
	public float getClouds() {
		return clouds;
	}
	public void setClouds(float clouds) {
		this.clouds = clouds;
	}
	public float getDt() {
		return dt;
	}
	public void setDt(float dt) {
		this.dt = dt;
	}
	public List<Object> getSys() {
		return sys;
	}
	public void setSys(List<Object> sys) {
		this.sys = sys;
	}
	public float getTimezone() {
		return timezone;
	}
	public void setTimezone(float timezone) {
		this.timezone = timezone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	@Override
	public String toString() {
		return "Dati [coordinate=" + coordinate + ", base=" + base + ", weather=" + weather + ", main=" + main
				+ ", visibility=" + visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys
				+ ", timezone=" + timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
	}
	
}
