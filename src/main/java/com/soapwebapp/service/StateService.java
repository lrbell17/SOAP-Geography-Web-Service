package com.soapwebapp.service;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.soapwebapp.soap_web_app.Region;
import com.soapwebapp.soap_web_app.State;

@Service
public class StateService {

	private static final HashMap<String, State> STATES = new HashMap<String, State>();
	
	// will get created when we start the program
	@PostConstruct
	public void initialize() {
		State california = new State();
		california.setName("California");
		california.setCapital("Sacramento");
		california.setPopulation(39510000);
		california.setRegion(Region.WEST);
		
		State florida = new State();
		florida.setName("Florida");
		florida.setCapital("Tallahasee");
		florida.setPopulation(21480000);
		florida.setRegion(Region.SOUTHEAST);
		
		State illinois = new State();
		illinois.setName("Illinois");
		illinois.setCapital("Springfield");
		illinois.setPopulation(12670000);
		illinois.setRegion(Region.MIDWEST);
		
		State newMexico = new State();
		newMexico.setName("New Mexico");
		newMexico.setCapital("Santa Fe");
		newMexico.setPopulation(2097000);
		newMexico.setRegion(Region.SOUTHWEST);
		
		State newYork = new State();
		newYork.setName("New York");
		newYork.setCapital("Albany");
		newYork.setPopulation(19450000);
		newYork.setRegion(Region.NORTHEAST);
		
		// add to hashmap
		STATES.put(california.getName(), california);
		STATES.put(florida.getName(), florida);
		STATES.put(illinois.getName(), illinois);
		STATES.put(newMexico.getName(), newMexico);
		STATES.put(newYork.getName(), newYork);
	}
	
	public static State getState(String name) {
		return STATES.get(name);
	}
}
