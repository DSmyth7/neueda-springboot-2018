package uk.ac.belfastmet.springbootbuildings.domain;

public class FloorAreaBuilding extends Building{
	
	private String floorArea;
	
	public FloorAreaBuilding() {
		super();
	}

	public FloorAreaBuilding(String floorArea) {
		super();
		this.floorArea = floorArea;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	
	
	

}
