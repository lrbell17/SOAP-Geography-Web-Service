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
		
		// add all 50 states
		STATES.put("California", new State("California", "Sacramento", 39512223, Region.WEST));
		STATES.put("Texas", new State("Texas", "Austin", 28995881, Region.SOUTHWEST));
		STATES.put("Florida", new State("Florida", "Tallahasee", 21477737, Region.SOUTHEAST));
		STATES.put("New York", new State("New York", "Albany", 19453561, Region.NORTHEAST));
		STATES.put("Pennsylvania", new State("Pennsylvania", "Harrisburg", 12801989, Region.NORTHEAST));
		STATES.put("Illinois", new State("Illinois", "Springfield", 12671821, Region.MIDWEST));
		STATES.put("Ohio", new State("Ohio", "Columbus", 11689100, Region.MIDWEST));
		STATES.put("Georgia", new State("Georgia", "Atlanta", 10617423, Region.SOUTHEAST));
		STATES.put("North Carolina", new State("North Carolina", "Raleigh", 10488084, Region.SOUTHEAST));
		STATES.put("Michigan", new State("Michigan", "Lansing", 9986857, Region.MIDWEST));
		STATES.put("New Jersey", new State("New Jersey", "Trenton", 8882190, Region.NORTHEAST));
		STATES.put("Virginia", new State("Virginia", "Richmond", 	8535519, Region.SOUTHEAST));
		STATES.put("Washington", new State("Washington", "Olympia", 7614893, Region.WEST));
		STATES.put("Arizona", new State("Arizona", "Phoenix", 7278717, Region.SOUTHWEST));
		STATES.put("Massachusetts", new State("Massachusetts", "Boston", 6892503, Region.NORTHEAST));
		STATES.put("Tennessee", new State("Tennessee", "Nashville", 6829174, Region.SOUTHEAST));
		STATES.put("Indiana", new State("Indiana", "Indianapolis", 6732219, Region.MIDWEST));
		STATES.put("Missouri", new State("Missouri", "Jefferson City", 6137428, Region.SOUTHEAST));
		STATES.put("Maryland", new State("Maryland", "Annapolis", 6045680, Region.NORTHEAST));
		STATES.put("Wisconsin", new State("Wisconsin", "Madison", 5822434, Region.MIDWEST));
		STATES.put("Colorado", new State("Colorado", "Denver", 5758736, Region.WEST));
		STATES.put("Minnesota", new State("Minnesota", "Saint Paul", 5639632, Region.MIDWEST));
		STATES.put("South Carolina", new State("South Carolina", "Columbia", 5148714, Region.SOUTHEAST));
		STATES.put("Alabama", new State("Alabama", "Montgomery", 4903185, Region.SOUTHEAST));
		STATES.put("Louisiana", new State("Louisiana", "Baton Rouge", 4648794, Region.SOUTHEAST));
		STATES.put("Kentucky", new State("Kentucky", "Frankfort", 4467673, Region.SOUTHEAST));
		STATES.put("Oregon", new State("Oregon", "Salem", 	4217737, Region.WEST));
		STATES.put("Oklahoma", new State("Oklahoma", "Oklahoma City", 3956971, Region.SOUTHWEST));
		STATES.put("Connecticut", new State("Connecticut", "Hartford", 3565287, Region.NORTHEAST));
		STATES.put("Utah", new State("Utah", "Salt Lake City", 3205958, Region.WEST));
		STATES.put("Iowa", new State("Iowa", "Des Moines", 3155070, Region.MIDWEST));
		STATES.put("Nevada", new State("Nevada", "Carson City", 3080156, Region.WEST));
		STATES.put("Arkansas", new State("Arkansas", "Little Rock", 3017804, Region.SOUTHEAST));
		STATES.put("Mississippi", new State("Mississippi", "Jackson", 2976149, Region.SOUTHEAST));
		STATES.put("Kansas", new State("Kansas", "Topeca", 2913314, Region.MIDWEST));
		STATES.put("New Mexico", new State("New Mexico", "Santa Fe", 2097000, Region.SOUTHWEST));
		STATES.put("West Virginia", new State("West Virginia", "Charleston", 1792147, Region.SOUTHEAST));
		STATES.put("Idaho", new State("Idaho", "Boise", 1787065, Region.WEST));
		STATES.put("Hawaii", new State("Hawaii", "Honolulu", 1415872, Region.WEST));
		STATES.put("New Hampshire", new State("New Hampshire", "Concord", 1359711, Region.NORTHEAST));
		STATES.put("Maine", new State("Maine", "Augusta", 1344212, Region.NORTHEAST));
		STATES.put("Montana", new State("Montana", "Helena", 1068778, Region.WEST));
		STATES.put("Rhode Island", new State("Rhode Island", "Providence", 1059361, Region.NORTHEAST));
		STATES.put("Delaware", new State("Delaware", "Dover", 973764, Region.NORTHEAST));
		STATES.put("South Dakota", new State("South Dakota", "Bismark", 884659, Region.MIDWEST));
		STATES.put("North Dakota", new State("North Dakota", "Pierre", 762062, Region.MIDWEST));
		STATES.put("Alaska", new State("Alaska", "Juno", 731545, Region.WEST));
		STATES.put("Vermont", new State("Vermont", "Montpelier", 623989, Region.NORTHEAST));
		STATES.put("Wyoming", new State("Wyoming", "Cheyanne", 578759, Region.WEST));

	}
	
	public static State getState(String name) {
		return STATES.get(name);
	}
}
