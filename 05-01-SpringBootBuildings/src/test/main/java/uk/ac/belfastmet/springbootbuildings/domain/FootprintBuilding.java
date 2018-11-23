package uk.ac.belfastmet.springbootbuildings.domain;

public class FootprintBuilding extends Building{

	private String footprint, lengthXWidth, description;

	public FootprintBuilding() {
		super();
	}


	public FootprintBuilding(String name, String country, String place, String image, String map, String footprint, String lengthXWidth, String description) {
		super(name, country, place, image, map);
		this.footprint = footprint;
		this.lengthXWidth = lengthXWidth;
		this.description = description;

	}


	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getLengthXWidth() {
		return lengthXWidth;
	}

	public void setLengthXWidth(String lengthXWidth) {
		this.lengthXWidth = lengthXWidth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
