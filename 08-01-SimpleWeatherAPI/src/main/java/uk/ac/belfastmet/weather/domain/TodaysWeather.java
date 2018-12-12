package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class TodaysWeather {
	private Location location;
	private Weather weather;
	private Wind wind;
	
	public String toString() {
		
		return location.toString() + weather.toString() + wind.toString();
	}
	
	
	
}
