package uk.ac.belfastmet.weather.domain;

import java.util.Map;

import lombok.Data;

@Data
public class TodaysWeather {
	private Location location;
	private Weather weather;
	private Wind wind;
	
	public String toString() {
		String location = "\n" + this.location.getName() + ", "
				+ this.location.getLatitude() + ", "
				+ this.location.getLongitude() + "\n";
		
		String weather = this.weather.getDescription() + ", "
				+ this.weather.getPrecipitation() + ", " 
				+ this.weather.getTemperature() + ", "
				+ this.weather.getHumidity()+ ", "
				+ this.weather.getPressure() + ", "
				+ this.weather.getCloudcover() + ", "
				
				+ this.weather.getImage() + "\n";
		
//		String wind = this.wind.getWind() + ", "
//				+ this.wind.getSpeed() + "\n";
		
		return location + weather;
	}
	
	
	
}
