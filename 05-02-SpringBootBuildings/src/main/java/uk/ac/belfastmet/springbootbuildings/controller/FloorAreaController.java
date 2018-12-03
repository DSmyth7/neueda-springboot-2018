package uk.ac.belfastmet.springbootbuildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.springbootbuildings.domain.FloorAreaBuilding;
import uk.ac.belfastmet.springbootbuildings.service.BuildingService;

@Controller
@RequestMapping("/floorarea")
public class FloorAreaController {
	
	@GetMapping("")
	public String home(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<FloorAreaBuilding> floorAreaBuildings = buildingService.getFloorAreaBuildings();
				
		model.addAttribute("pageTitle","Largest Buildings by Floor Area!");
		model.addAttribute("floorAreaBuildings", floorAreaBuildings);
		return "floorarea.html";
	}

}
