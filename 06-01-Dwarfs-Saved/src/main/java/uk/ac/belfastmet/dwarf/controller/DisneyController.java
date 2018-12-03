package uk.ac.belfastmet.dwarf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.repository.DwarfRepository;
import uk.ac.belfastmet.dwarf.service.DwarfService;

@Controller
@RequestMapping("/disney")
public class DisneyController {
	
	DwarfRepository dwarfRepository;
	
	
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}



	@GetMapping("")
	public String home(Model model) {
		
		//DwarfService dwarfService = new DwarfService();
		//ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
				
		model.addAttribute("pageTitle","Dwarf!");
		model.addAttribute("headingOne","Disney");
		//model.addAttribute("disneyDwarfs", disneyDwarfs);
		model.addAttribute("disneyDwarfs", this.dwarfRepository.findByAuthor("Disney"));
		return "dwarf.html";
	}

}
