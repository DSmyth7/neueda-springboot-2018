package uk.ac.belfastmet.sbcontroller.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystory")
public class ToyStory {
	
	@GetMapping("")
	public String toystory(Model model) {
		return "<h1>Toy Story Characters!</h1>";
		
	}
	
	@GetMapping("/woody")
	public String woody(Model model) {
		return "<h1>Woody was played by Tom Hanks!</h1>";
		
	}
	
	@GetMapping("/buzz")
	public String buzz(Model model) {
		return "<h1>Buzz was played by Tim Allen!</h1>";
		
	}
	
	@GetMapping("/slinky")
	public String slinky(Model model) {
		return "<h1>Slinky was played by Jim Varney!</h1>";
		
	}
	
	@GetMapping("/ham")
	public String ham(Model model) {
		return "<h1>Ham was played by John Ratzenberger!</h1>";
		
	}
	
	@GetMapping("/rex")
	public String rex(Model model) {
		return "<h1>Rex was played by Wallace Shawn!</h1>";
		
	}
	
	@GetMapping("/mrpotatohead")
	public String mrpotatohead(Model model) {
		return "<h1>Mr. Potato Head was played by Don Rickies!</h1>";
		
	}
	
}
