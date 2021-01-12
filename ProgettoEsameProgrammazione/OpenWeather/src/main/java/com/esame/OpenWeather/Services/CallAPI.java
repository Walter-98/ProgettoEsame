package com.esame.OpenWeather.Services;

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

import com.esame.OpenWeather.Model.Metadata;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CallAPI {
	
	public static Map<Object, Object> resultsActual = new HashMap<Object, Object>();
	public static Map<Object, Object> resultsForecast = new HashMap<Object, Object>();
	public static Map<Object, Object> resultsHistory = new HashMap<Object, Object>();
	Metadata metadata;
	String city= metadata.getCity();
	
public Map<Object, Object> actual(JSONObject jsonObject) {
		
		JSONParser parser = new JSONParser();
		try {

			URL weath = new URL("api.openweathermap.org/data/2.5/weather?q="+city+"&appid=ef43cab5ea48da20e2529f2789c8f546");
			HttpsURLConnection yc = (HttpsURLConnection) weath.openConnection();
			yc.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");

			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				JSONObject statsA = (JSONObject) parser.parse(inputLine);

				HashMap<Object, Object> mp = new ObjectMapper().convertValue(statsA, HashMap.class);
				Iterator inpm = mp.entrySet().iterator();
				while (inpm.hasNext()) {
					Map.Entry entry = (Map.Entry) inpm.next();
					resultsActual.put(entry.getKey(),entry.getValue());
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
		return resultsActual;
	}

	public Map<Object, Object> forecast(String city, String state) {
		JSONParser parser = new JSONParser();

		try {
			URL weath = new URL(
					"api.openweathermap.org/data/2.5/forecast?q=Rome&appid=ef43cab5ea48da20e2529f2789c8f546");
			HttpsURLConnection yc = (HttpsURLConnection) weath.openConnection();
			yc.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");

			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				JSONObject statsF = (JSONObject) parser.parse(inputLine);
				HashMap<Object, Object> mp = new ObjectMapper().convertValue(statsF, HashMap.class);
				Iterator inpm = mp.entrySet().iterator();
				while (inpm.hasNext()) {
					Map.Entry entry = (Map.Entry) inpm.next();
					resultsForecast.put(entry.getKey(), entry.getValue());
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
		return resultsForecast;
	}

	public Map<Object, Object> history(String city, String state) {
		JSONParser parser = new JSONParser();

		try {
			URL weath = new URL(
					"http://history.openweathermap.org/data/2.5/history/city?q=Rome&appid=ef43cab5ea48da20e2529f2789c8f546");
			HttpsURLConnection yc = (HttpsURLConnection) weath.openConnection();
			yc.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");

			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				JSONObject statsH = (JSONObject) parser.parse(inputLine);
				HashMap<Object, Object> mp = new ObjectMapper().convertValue(statsH, HashMap.class);
				Iterator inpm = mp.entrySet().iterator();
				while (inpm.hasNext()) {
					Map.Entry entry = (Map.Entry) inpm.next();
					resultsHistory.put(entry.getKey(), entry.getValue());
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
		return resultsHistory;
	}

}
