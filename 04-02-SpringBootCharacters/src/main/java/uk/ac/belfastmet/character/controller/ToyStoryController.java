package uk.ac.belfastmet.character.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.character.domain.MovieCharacters;
import uk.ac.belfastmet.character.service.CharacterService;


@Controller
@RequestMapping("/toystory")
public class ToyStoryController {
	
	@GetMapping("")
	public String home(Model model) {
		
		CharacterService characterService = new CharacterService();
		ArrayList<MovieCharacters> toyStoryCharacters = characterService.getToyStoryCharacters();
		model.addAttribute("pageTitle","Toy Story!");
		model.addAttribute("toyStoryCharacters", toyStoryCharacters);
		return "toystory.html";
		
	}

}
