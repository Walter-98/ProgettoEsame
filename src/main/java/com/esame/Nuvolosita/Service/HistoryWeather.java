package com.esame.Nuvolosita.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HistoryWeather {
	public HistoryWeather(String city,String state){
		super();
	}
	public  void history(String city,String state){
	JSONParser parser = new JSONParser();

	 try {
		 URL weath = new URL("http://history.openweathermap.org/data/2.5/history/city?q=Rome&appid=ef43cab5ea48da20e2529f2789c8f546");
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
}
       }
        in.close();
       } catch (FileNotFoundException e11) {
           e11.printStackTrace();
       } catch (IOException e1) {
           e1.printStackTrace();
       } catch (ParseException e) {
           e.printStackTrace();
       }
	 }
}
