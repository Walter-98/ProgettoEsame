package com.esame.Nuvolosita.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.esame.Nuvolosita.Model.Record;

public class JSonParser {
	//private static String key = "ef43cab5ea48da20e2529f2789c8f546";
	public  static ArrayList<String> records = new ArrayList<String>();
	public static ArrayList<Object> value = new ArrayList<Object>();
	 JSONParser parser = new JSONParser();
	//private String fileName;
	public Map<String,Object> results = new HashMap<String,Object>();	
	//fileWriter fp= new fileWriter();
		public JSonParser(String city, String state) {
		//super(city, state, country);
		// TODO Auto-generated constructor stub
		}

		public  Map<String, Object> actualWeather(String city,String state){    //DA RIVEDERE PER RETURN!!!!


	 try {
		 URL weath = new URL("api.openweathermap.org/data/2.5/weather?q=Rome&appid=ef43cab5ea48da20e2529f2789c8f546");
		 HttpsURLConnection yc = (HttpsURLConnection) weath.openConnection();
 		yc.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
         
         BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        
         String inputLine;
         while ((inputLine = in.readLine()) != null) { 
         	JSONObject stats = (JSONObject) parser.parse(inputLine);
         	HashMap<String,Object> mp = new ObjectMapper().convertValue(stats, HashMap.class);
        	 Iterator inpm = mp.entrySet().iterator();
        	 while(inpm.hasNext()) {
        	  Map.Entry entry = (Map.Entry)inpm.next();   
           // Stampa a schermo la coppia chiave-valore;
           System.out.print("Key =  " + entry.getKey());
           System.out.println("    Value = " + entry.getValue());
           records.add((String) entry.getKey());
           value.add(entry.getValue());
     	   results.put((String) entry.getKey(), entry.getValue());
        	 }
         }
         in.close();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } catch (ParseException e) {
         e.printStackTrace();
     }
	return results;
	}  
}
