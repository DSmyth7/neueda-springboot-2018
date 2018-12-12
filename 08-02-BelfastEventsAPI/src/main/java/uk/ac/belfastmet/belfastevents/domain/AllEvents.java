package uk.ac.belfastmet.belfastevents.domain;

import java.awt.Event;
import java.util.ArrayList;

import lombok.Data;

@Data
public class AllEvents {
	
	private ArrayList<Events> allEvents;
	
//	public Event getEventWithId(String identifier) {
//		for(int i = 0; i < this.allEvents.size(); i++) {
//			Events currentEvent = this.allEvents.get(i);
//			if(currentEvent.getIdentifier().equals(identifier)){
//				return currentEvent;
//			}
//		}
//		return null;
//	}

}
