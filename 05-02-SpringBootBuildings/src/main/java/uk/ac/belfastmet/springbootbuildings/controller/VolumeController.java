package uk.ac.belfastmet.springbootbuildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.springbootbuildings.domain.VolumeBuilding;
import uk.ac.belfastmet.springbootbuildings.service.BuildingService;


@Controller
@RequestMapping("/volume")
public class VolumeController {
	
	@GetMapping("")
	public String home(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<VolumeBuilding> volumeBuildings = buildingService.getVolumeBuildings();
				
		model.addAttribute("pageTitle","Largest Buildings by Volume!");
		model.addAttribute("volumeBuildings", volumeBuildings);
		return "volume.html";
	}

}
