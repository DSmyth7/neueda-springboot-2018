package uk.ac.belfastmet.character.service;

import java.util.ArrayList;

import uk.ac.belfastmet.character.domain.MovieCharacters;


public class CharacterService {

	public CharacterService() {
		super();
	}
	
	public ArrayList<MovieCharacters> getShrekCharacters(){
		ArrayList<MovieCharacters> characters = new ArrayList<MovieCharacters>();
		
	
		MovieCharacters sleepy = new MovieCharacters("Sleepy", "Disney", "Sleepy.png");
		characters.add(sleepy);
		MovieCharacters happy = new MovieCharacters("Happy", "Disney", "Happy.png");
		characters.add(happy);
		MovieCharacters dopey = new MovieCharacters("Dopey", "Disney", "Dopey.png");
		characters.add(dopey);
		MovieCharacters bashful = new MovieCharacters("Bashful", "Disney", "Bashful.png");
		characters.add(bashful);
		MovieCharacters sneezy = new MovieCharacters("Sneezy", "Disney", "Sneezy.png");
		characters.add(sneezy);
		MovieCharacters doc = new MovieCharacters("Doc", "Disney", "Doc.png");
		characters.add(doc);
		MovieCharacters grumpy = new MovieCharacters("Grumpy", "Disney", "Grumpy.png");
		characters.add(grumpy);
		
		return characters;
	}
	
	public ArrayList<MovieCharacters> getToyStoryCharacters(){
		ArrayList<MovieCharacters> characters = new ArrayList<MovieCharacters>();
		
		//Toy Story
		MovieCharacters sleepy = new MovieCharacters("Sleepy", "Disney", "Sleepy.png");
		characters.add(sleepy);
		MovieCharacters happy = new MovieCharacters("Happy", "Disney", "Happy.png");
		characters.add(happy);
		MovieCharacters dopey = new MovieCharacters("Dopey", "Disney", "Dopey.png");
		characters.add(dopey);
		MovieCharacters bashful = new MovieCharacters("Bashful", "Disney", "Bashful.png");
		characters.add(bashful);
		MovieCharacters sneezy = new MovieCharacters("Sneezy", "Disney", "Sneezy.png");
		characters.add(sneezy);
		MovieCharacters doc = new MovieCharacters("Doc", "Disney", "Doc.png");
		characters.add(doc);
		MovieCharacters grumpy = new MovieCharacters("Grumpy", "Disney", "Grumpy.png");
		characters.add(grumpy);
		
		return characters;
	}
	
}
