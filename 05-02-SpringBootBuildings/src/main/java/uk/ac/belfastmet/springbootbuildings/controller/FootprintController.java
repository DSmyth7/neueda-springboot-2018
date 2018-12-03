package uk.ac.belfastmet.springbootbuildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.springbootbuildings.domain.FootprintBuilding;
import uk.ac.belfastmet.springbootbuildings.service.BuildingService;

@Controller
@RequestMapping("/footprint")
public class FootprintController {

	@GetMapping("")
	public String home(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<FootprintBuilding> footprintBuildings = buildingService.getFootprintBuildings();
				
		model.addAttribute("pageTitle","Largest Buildings by Footprint!");
		model.addAttribute("footprintBuildings", footprintBuildings);
		return "footprint.html";
	}
}
