package com.esame.Nuvolosita.Filter;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterClouds {
	
	public static Object cloudsactual(Map results)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results, HashMap.class);
		Object rit=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="clouds") {
					System.out.println(entry.getValue());
					rit=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit;
	}
	public static Object cloudsForecast(Map results1)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results1, HashMap.class);
		Object rit1=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="clouds") {
					System.out.println(entry.getValue());
					rit1=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit1;
	}
	public static Object cloudsHistory(Map results2)   {
		HashMap<Object, Object> mp = new ObjectMapper().convertValue(results2, HashMap.class);
		Object rit2=null;
		for(Map.Entry<Object, Object> entry : mp.entrySet()) {
				String s= (String) entry.getKey();
				if(s=="clouds") {
					System.out.println(entry.getValue());
					rit2=entry.getValue();
					}else
					System.out.println("errore");
      	  }
		return rit2;
	}
	
	
}
