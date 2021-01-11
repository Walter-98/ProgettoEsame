package com.esame.Nuvolosita.Filter;
import java.util.HashMap;
import java.util.Map;

import com.esame.Nuvolosita.Service.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class FilterMain extends ActualWeather{

	public FilterMain(String city, String state) {
		super(city, state);
		// TODO Auto-generated constructor stub
	}

	public static Object mainactual(Map results)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results, HashMap.class);
		Object rit=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="main") {
					System.out.println(entry.getValue());
					rit=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit;
	}
	public static Object mainForecast(Map results1)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results1, HashMap.class);
		Object rit1=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="main") {
					System.out.println(entry.getValue());
					rit1=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit1;
	}
	public static Object mainHistory(Map results2)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results2, HashMap.class);
		Object rit2=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="main") {
					System.out.println(entry.getValue());
					rit2=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit2;
	}
	
	
}