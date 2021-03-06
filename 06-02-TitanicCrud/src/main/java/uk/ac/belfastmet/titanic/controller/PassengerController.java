package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;


@Controller
@RequestMapping("")
public class PassengerController {
	
	PassengerRepository passengerRepository;
		
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}


	@GetMapping("passenger")
	public String passenger(Model model) {
		model.addAttribute("pageTitle", "Titanic Passenger!");
		model.addAttribute("passengers", this.passengerRepository.findAll());
		return "passengersPage.html";
	
	}
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Titanic Passenger!");
		model.addAttribute("passengers", this.passengerRepository.findByPassengerId(passengerId));
		return "passengersPage.html";
	
	}
	
	@GetMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model) {
		
		model.addAttribute("pageTitle", "Titanic Passenger!");
		model.addAttribute("passengers", this.passengerRepository.findByNameContaining(name));
		return "passengersPage.html";
	
	}
	
	@GetMapping("/searchsexembarked")
	public String searchSexEmbarked(@RequestParam("sex") String sex, @RequestParam("embarked") String embarked, Model model) {
		model.addAttribute("pageTitle", "Titanic Passenger!");
		model.addAttribute("dwarfs", this.passengerRepository.findBySexAndEmbarked(sex, embarked));
		return "passengersPage.html";
	
	}
	


}
