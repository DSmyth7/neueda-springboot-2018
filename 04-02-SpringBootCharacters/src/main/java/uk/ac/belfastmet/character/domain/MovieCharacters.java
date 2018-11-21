package uk.ac.belfastmet.character.domain;

public class MovieCharacters {

	private String name, author, image;

	public MovieCharacters() {
		super();
	}
	

	public MovieCharacters(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}

