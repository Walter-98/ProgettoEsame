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

//import com.esame.Nuvolosita.Model.Metadata;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.esame.Nuvolosita.Model.Metadata;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ActualWeather {

	public static ArrayList<Object> records = new ArrayList<Object>();
	public static ArrayList<Object> value = new ArrayList<Object>();
	public static Map<Object, Object> results = new HashMap<Object, Object>();
	public static Map<Object, Object> results1 = new HashMap<Object, Object>();
	public static Map<Object, Object> results2 = new HashMap<Object, Object>();

	public ActualWeather(String city, String state) {
		super();
	}

	public Map<Object, Object> actual(String city, String state) {
		JSONParser parser = new JSONParser();

		try {

			URL weath = new URL(
					"api.openweathermap.org/data/2.5/weather?q=Rome&appid=ef43cab5ea48da20e2529f2789c8f546");
			HttpsURLConnection yc = (HttpsURLConnection) weath.openConnection();
			yc.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");

			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				JSONObject stats = (JSONObject) parser.parse(inputLine);

				HashMap<Object, Object> mp = new ObjectMapper().convertValue(stats, HashMap.class);
				Iterator inpm = mp.entrySet().iterator();
				while (inpm.hasNext()) {
					Map.Entry entry = (Map.Entry) inpm.next();
					records.add((String) entry.getKey());
					value.add(entry.getValue());
					results.put(records, value);

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
		return results;
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
				JSONObject stats = (JSONObject) parser.parse(inputLine);
				HashMap<Object, Object> mp = new ObjectMapper().convertValue(stats, HashMap.class);
				Iterator inpm = mp.entrySet().iterator();
				while (inpm.hasNext()) {
					Map.Entry entry = (Map.Entry) inpm.next();
					results1.put(entry.getKey(), entry.getValue());
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
		return results1;
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
				JSONObject stats = (JSONObject) parser.parse(inputLine);
				HashMap<Object, Object> mp = new ObjectMapper().convertValue(stats, HashMap.class);
				Iterator inpm = mp.entrySet().iterator();
				while (inpm.hasNext()) {
					Map.Entry entry = (Map.Entry) inpm.next();
					results2.put(entry.getKey(), entry.getValue());
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
		return results2;
	}

}

