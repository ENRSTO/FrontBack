package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppController {
	
	final static ArrayList<String> cities;
	
	static {
		// Inizializza l'ArrayList con valori predefiniti
		cities = new ArrayList<>();
		cities.add("Roma");
		cities.add("Milano");
		cities.add("Napoli");
		cities.add("Varese");
		cities.add("Alessandria");
		cities.add("Vicenza");
		cities.add("Venezia");
		cities.add("USA");
	}
	
	
	@GetMapping("/out")
	public static List<String> printCities() {

		// accepts an argument and returns a boolean
		Predicate<String> filterCity = city -> city.equals("Roma") || city.equals("Milano") ||  city.equals("Venezia");
	//	var lista  = cities.stream().collect(Collectors.toList());

		var lista  = cities.stream().filter(filterCity).collect(Collectors.toList());
		System.out.println(lista);
		return lista;
	}	
	
	
	@PostMapping("/in")
	public void setCities(@RequestBody NuovaStringaRequest nuova) {
		
		String nuovaStringa = nuova.getNuovaStringa();
		cities.add(nuovaStringa);	
		System.out.println("inserita citta -> x");
		System.out.println("!!");
	       
	}	

}
