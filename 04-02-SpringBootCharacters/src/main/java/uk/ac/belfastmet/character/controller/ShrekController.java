package uk.ac.belfastmet.character.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.character.domain.MovieCharacters;
import uk.ac.belfastmet.character.service.CharacterService;

@Controller
@RequestMapping("/shrek")
public class ShrekController {
	
	@GetMapping("")
	public String home(Model model) {
		
		CharacterService characterService = new CharacterService();
		ArrayList<MovieCharacters> shrekCharacters = characterService.getShrekCharacters();
				
		model.addAttribute("pageTitle","Shrek!");
		model.addAttribute("shrekCharacters", shrekCharacters);
		return "shrek.html";
	}

}
