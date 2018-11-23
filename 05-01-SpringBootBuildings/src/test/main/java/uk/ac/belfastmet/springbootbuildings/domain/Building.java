package uk.ac.belfastmet.springbootbuildings.domain;

public class Building {
	
	private String name, country, place, image, map;

	public Building() {
		super();
	}

	public Building(String name, String country, String place, String image, String map) {
		super();
		this.name = name;
		this.country = country;
		this.place = place;
		this.image = image;
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}
	
	

}
