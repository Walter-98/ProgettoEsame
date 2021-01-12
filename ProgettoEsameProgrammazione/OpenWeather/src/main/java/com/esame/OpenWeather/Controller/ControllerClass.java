package com.esame.OpenWeather.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esame.OpenWeather.Model.Dati;
import com.esame.OpenWeather.Model.Metadata;

@RestController
public class ControllerClass {

	Metadata metadata= new Metadata();
	
	@RequestMapping(value="/metadata",method = RequestMethod.POST)
	public ResponseEntity<Object> createcity(@RequestBody Dati dati) {
		metadata.add();
		return new ResponseEntity<>("City is OK", HttpStatus.CREATED);	
	}
	@RequestMapping(value="/metadata",method = RequestMethod.POST)
	public ResponseEntity<Object> createstate(@RequestBody Dati dati) {
		metadata.add();
		return new ResponseEntity<>("State is OK", HttpStatus.CREATED);
	}
	@RequestMapping(value = "/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadataCity() {

		return new ResponseEntity<>(metadata.getCity(), HttpStatus.OK);
	}
	@RequestMapping(value = "/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadataState() {

		return new ResponseEntity<>(metadata.getState(), HttpStatus.OK);
	}
}
