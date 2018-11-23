package uk.ac.belfastmet.springbootbuildings.domain;

public class VolumeBuilding extends Building{
	
	private String floorArea, volume, description;

	public VolumeBuilding() {
		super();
	}

	public VolumeBuilding(String name, String country, String place, String image, String map, String floorArea,
			String volume, String description) {
		super(name, country, place, image, map);
		this.floorArea = floorArea;
		this.volume = volume;
		this.description = description;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
