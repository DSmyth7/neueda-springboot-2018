package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class Wind {
	
	private String direction;
	private Integer speed;
	
	public String toString() {
		
		String wind = this.getSpeed() + ", "
				+ this.getDirection() + "\n";
		
		return wind;
	}

}
