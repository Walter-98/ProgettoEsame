package com.esame.Nuvolosita.Filter;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterWind {
	
	public static Object windsactual(Map results)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results, HashMap.class);
		Object rit=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="wind") {
					System.out.println(entry.getValue());
					rit=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit;
	}
	public static Object windForecast(Map results1)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results1, HashMap.class);
		Object rit1=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="wind") {
					System.out.println(entry.getValue());
					rit1=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit1;
	}
	public static Object windHistory(Map results2)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results2, HashMap.class);
		Object rit2=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="wind") {
					System.out.println(entry.getValue());
					rit2=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit2;
	}
}
