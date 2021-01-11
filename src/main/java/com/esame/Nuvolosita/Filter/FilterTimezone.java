package com.esame.Nuvolosita.Filter;

import java.util.Map;

import org.json.simple.JSONObject;

import com.esame.Nuvolosita.Service.ActualWeather;

public class FilterTimezone extends ActualWeather{

	public FilterTimezone(String city, String state) {
		super(city, state);
		// TODO Auto-generated constructor stub
	}

	public static Object actualTimezone(JSONObject stats) {
		JSONObject Obj = new JSONObject();
		JSONObject timezone = new JSONObject();
		
		return timezone;
	}

	
	
}
