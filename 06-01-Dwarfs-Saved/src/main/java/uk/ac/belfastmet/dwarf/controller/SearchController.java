package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarf.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class SearchController {
	
	DwarfRepository dwarfRepository;
	
	
	public SearchController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer dwarfId, Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("headingOne","");
		model.addAttribute("dwarfs", this.dwarfRepository.findByDwarfId(dwarfId));
		return "dwarf.html";
	
	}
	
	@PostMapping("/searchname")
	public String searchName(@RequestParam("name") String dwarfName, Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("headingOne","");
		model.addAttribute("dwarfs", this.dwarfRepository.findByName(dwarfName));
		return "dwarf.html";
	
	}
	
	@GetMapping("/searchauthor")
	public String searchAuthor(@RequestParam("author") String authorName, Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("headingOne","");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor(authorName));
		return "dwarf.html";
	
	}
	
	@GetMapping("/searchnameauthor")
	public String searchNameAuthor(@RequestParam("name") String dwarfName, @RequestParam("author") String authorName, Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("headingOne","");
		model.addAttribute("dwarfs", this.dwarfRepository.findByNameAndAuthor(dwarfName, authorName));
		return "dwarf.html";
	
	}

}
