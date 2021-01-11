package com.esame.Nuvolosita.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.Nuvolosita.Model.Metadata;
import com.esame.Nuvolosita.Service.ActualWeather;
import com.esame.Nuvolosita.Service.JSonParser;
//import com.esame.Nuvolosita.Service.Weather;
import com.esame.Nuvolosita.Model.Record;


@RestController
public class Controller  {
	
	//@Autowired
//	private Metadata metadata;
	
	
	@GetMapping("/metadata")
	public Metadata example(@RequestParam(name = "param1", defaultValue = "value") String param1) {
		return new Metadata("Roma","Italia");
	}
	/*@RequestMapping(value="/metadata",method =RequestMethod.POST)
	public String  createCity(@RequestBody Metadata metadata) {
		String c=metadata.getCity();
		return  c;
	}
	@RequestMapping(value="/metadata",method =RequestMethod.POST)
	public String  createState(@RequestBody Metadata metadata) {
		String s=metadata.getState();
		return  s;
	}*/

	/*
	 * @RequestMapping(value="/metadata",method =RequestMethod.DELETE) public void
	 * deleteCity(@PathVariable("city")String city) { metadata.setCity(city); }
	 * 
	 * @RequestMapping(value="/metadata",method =RequestMethod.DELETE) public void
	 * deleteState(@PathVariable("state")String state) { metadata.setState(state); }
	 */
	@GetMapping("/actual")
	public Map<Object,Object> getActual(){
		return ActualWeather.results;
		
	}
}
