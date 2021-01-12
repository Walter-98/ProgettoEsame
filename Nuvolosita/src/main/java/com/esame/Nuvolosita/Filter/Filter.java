package com.esame.Nuvolosita.Filter;
import com.esame.Nuvolosita.Service.*;
public interface Filter {
	public abstract  void FilterMain();
	public abstract  void FilterTimezone();
	public abstract  void FilterClouds();
	public abstract  void FilterWind();
	public abstract  void FilterWeather();
}
