package uk.ac.belfastmet.breakfastcereals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.breakfastcereals.repository.CerealRepository;



@Controller
@RequestMapping("")
public class CerealController {
	
	CerealRepository cerealRepository;
		
	
	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Breakfast Cereals!");
		model.addAttribute("cereals", this.cerealRepository.findByCerealId(cerealId));
		return "cerealPage.html";
	
	}
	
	@GetMapping("/searchcereal")
	public String searchCereal(@RequestParam("cereal") String cereal, Model model) {
		model.addAttribute("pageTitle", "Breakfast Cereals!");
		model.addAttribute("cereals", this.cerealRepository.findByCerealContaining(cereal));
		return "cerealPage.html";
	
	}

}
