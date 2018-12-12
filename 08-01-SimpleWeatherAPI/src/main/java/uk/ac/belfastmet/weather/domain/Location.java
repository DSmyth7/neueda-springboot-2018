package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class Location {
	
	private String name;
	private Float latitude, longitude;
	
	public String toString() {
		String location = "\n" + this.getName() + ", "
				+ this.getLatitude() + ", "
				+ this.getLongitude() + "\n";

		return location;
	}
}
