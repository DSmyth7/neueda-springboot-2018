package uk.ac.belfastmet.character.service;

import java.util.ArrayList;

import uk.ac.belfastmet.character.domain.MovieCharacters;


public class CharacterService {

	public CharacterService() {
		super();
	}
	
	public ArrayList<MovieCharacters> getShrekCharacters(){
		ArrayList<MovieCharacters> characters = new ArrayList<MovieCharacters>();
		
	
		MovieCharacters shrek = new MovieCharacters("Shrek", "DreamWorks", "Shrek.png");
		characters.add(shrek);
		MovieCharacters donkey = new MovieCharacters("Donkey", "DreamWorks", "Donkey.png");
		characters.add(donkey);
		MovieCharacters fiona = new MovieCharacters("Princess Fiona", "DreamWorks", "Fiona.png");
		characters.add(fiona);
		MovieCharacters puss = new MovieCharacters("Puss in Boots", "DreamWorks", "Puss.png");
		characters.add(puss);

		return characters;
	}
	
	public ArrayList<MovieCharacters> getToyStoryCharacters(){
		ArrayList<MovieCharacters> characters = new ArrayList<MovieCharacters>();
		
		//Toy Story
		MovieCharacters woody = new MovieCharacters("Woody", "Pixar", "Woody.png");
		characters.add(woody);
		MovieCharacters hamm = new MovieCharacters("Hamm", "Pixar", "Hamm.jpg");
		characters.add(hamm);
		MovieCharacters buzz = new MovieCharacters("Buzz Lightyear", "Pixar", "Buzz.jpg");
		characters.add(buzz);
		MovieCharacters rex = new MovieCharacters("Rex", "Pixar", "Rex.png");
		characters.add(rex);
	
		
		return characters;
	}
	
}
