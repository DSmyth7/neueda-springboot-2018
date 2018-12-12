package uk.ac.belfastmet.belfastevents.controller;

import java.awt.Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.belfastevents.domain.AllEvents;
import uk.ac.belfastmet.belfastevents.domain.Events;


@Controller
@RequestMapping()
public class EventsController {
	
	@GetMapping("")
	public String home() {
		
		return "homePage.html";
	}
	
	@GetMapping("/events")
	public String displayEvent(Model model) {
		String eventUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		
		AllEvents allEvents = restTemplate.getForObject(eventUrl, AllEvents.class);

		
		model.addAttribute("events", allEvents.getAllEvents());
		
		return "events.html";
	}

}
