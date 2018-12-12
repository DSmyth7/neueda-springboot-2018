package uk.ac.belfastmet.weather.domain;


import lombok.Data;

@Data
public class Weather {
	private String description, precipitation, humidity, image;
	private Integer temperature, pressure, cloudcover;
	private Wind wind;
	
	public String toString() {
		
		String weather = this.getDescription() + ", "
				+ this.getPrecipitation() + ", " 
				+ this.getTemperature() + ", "
				+ this.getHumidity()+ ", "
				+ this.getPressure() + ", "
				+ this.getCloudcover() + ", "
				+ this.getImage() + "\n";
		
		return weather;
	}

}
