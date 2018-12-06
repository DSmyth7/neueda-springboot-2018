package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class ViewController {

	PassengerRepository passengerRepository;
		
	
	public ViewController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Titanic View!");
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		return "view.html";
	
	}
	
	@GetMapping("/add")
	public String addPassenger(Model model) {
		model.addAttribute("pageTitle", "Titanic Add!");
		model.addAttribute("passenger", new Passenger());
		return "edit.html";
	}
	
	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Edit Passenger!");
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		return "edit.html";
	}

	@PostMapping("/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "edit.html";
		} else {
			Passenger savedPassenger = this.passengerRepository.save(passenger);
			return "redirect:/view/" + passenger.getPassengerId();
		}
	}
	
	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successfully deleted passenger!");
		this.passengerRepository.deleteById(passengerId);
		return "redirect:/passenger";
	
	}
}
