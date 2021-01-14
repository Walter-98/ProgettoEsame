package com.esame.OpenWeather.Filters;

import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONObject;

import com.esame.OpenWeather.Services.CallAPI;

public class CloudFilter {
	
	public Map<String,Object> CloudActual (Map resultActual){
	
	JSONObject map = (JSONObject) CallAPI.actual(resultActual);
	
	Iterator inpm = map.entrySet().iterator();
	while (inpm.hasNext()) {
		Map.Entry entry = (Map.Entry) inpm.next();
		JSONObject jsonOng = (JSONObject) entry.getValue();
		jsonOng.get("clouds");
	}
	return 
	}
}
