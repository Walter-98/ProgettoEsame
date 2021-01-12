package com.esame.Nuvolosita.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esame.Nuvolosita.Model.Metadata;



@RestController
public class Controller  {
	
	@Autowired
	private Metadata metadata;
	
	
	@GetMapping("/metadata")
	public Metadata example() {
		return new Metadata("Roma","Italia");
	}
	@GetMapping("/metadata")
	public String getscity(@PathVariable String city) {
		return metadata.getCity();
	}
	@GetMapping("/metadata")
	public String getstate(@PathVariable String state) {
		return metadata.getState();
	}
	@PostMapping("/metadata")
	 public String createCity(@PathVariable String city) {
		return city;
	}
	
	/*@PostMapping("/metadata")
	 public String createState(@PathVariable String state) {
		String[] codes = java.util.Locale.getISOLanguages();
		for(int i=0;i<codes.length;i++) {
		if(metadata.getState()==codes[i])
			return state;
		else
			return("errore");
		}
		return state;
	}*/
	
	
}
