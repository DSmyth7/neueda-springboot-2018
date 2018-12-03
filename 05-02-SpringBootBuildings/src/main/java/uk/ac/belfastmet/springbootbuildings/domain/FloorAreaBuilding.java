package uk.ac.belfastmet.springbootbuildings.domain;

public class FloorAreaBuilding extends Building{
	
	private String floorArea;
	
	public FloorAreaBuilding() {
		super();
	}

	public FloorAreaBuilding(String name, String country, String place, String image, String map, String floorArea) {
		super(name, country, place, image, map);
		this.floorArea = floorArea;

	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	
	
}
