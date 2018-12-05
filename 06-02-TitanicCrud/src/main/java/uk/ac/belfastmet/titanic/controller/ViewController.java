package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successfully deleted passenger!");
		this.passengerRepository.deleteById(passengerId);
		return "redirect:/passenger";
	
	}
}
