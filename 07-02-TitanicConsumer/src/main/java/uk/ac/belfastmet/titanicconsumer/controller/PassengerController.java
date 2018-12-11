package uk.ac.belfastmet.titanicconsumer.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerService;
import uk.ac.belfastmet.titanicconsumer.service.PassengerServiceImpl;


@Controller
@RequestMapping("")
public class PassengerController {
	
	@Autowired
	PassengerServiceImpl passengerService;
	AllPassengers allPassengers;
	
	
	public PassengerController() {
		super();
	}

	
	public PassengerController(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;
	}


	public PassengerController(PassengerServiceImpl passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}



	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle", "View Passenger");
		
		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);

		
		return "view.html";
	}
	
	@GetMapping("/passengers")
	public String passenger(Model model) {
		
		model.addAttribute("pageTitle", "Titanic Passengers!");
		
		ArrayList<Passenger> passengers = this.passengerService.list();
		model.addAttribute("passengers", passengers);
		
		return "passengersPage.html";
	
	}
	
	
	
	@GetMapping("/add/")
	public String addPassenger(Model model) {
		model.addAttribute("pageTitle", "Titanic Add");
		Passenger passenger = new Passenger();
		model.addAttribute("passenger", passenger);
		return "edit.html";
	}
	
	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		Passenger passenger = this.passengerService.get(passengerId);
		
		model.addAttribute("pageTitle", "Edit Passenger");
		model.addAttribute("passenger", this.passengerService.update(passenger));
		return "edit.html";
	}

	@PostMapping("/save")
	public String savePassenger(@Valid Passenger passenger, @RequestParam("addUpdate") String addUpdate, Model model) {

		model.addAttribute("pageTitle", "Edit Passenger!");
		
						
		if(addUpdate.equals("Titanic Add")) {
			this.passengerService.add(passenger);
			return "redirect:/passengers";
		}
		else {
			this.passengerService.update(passenger);
			return "redirect:/view/" + passenger.getPassengerId();
		}
			
			
			
		}
	
	
	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successfully deleted passenger!");
		this.passengerService.delete(passengerId);
		return "redirect:/passengers";
	
	}
	
}
