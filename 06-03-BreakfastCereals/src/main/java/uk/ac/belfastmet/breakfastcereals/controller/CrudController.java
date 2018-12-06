package uk.ac.belfastmet.breakfastcereals.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.breakfastcereals.domain.Cereal;
import uk.ac.belfastmet.breakfastcereals.repository.CerealRepository;


@Controller
@RequestMapping("")
public class CrudController {
	
CerealRepository cerealRepository;
		
	
	public CrudController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	
	@GetMapping("/cereal")
	public String cereal(Model model) {
		model.addAttribute("pageTitle", "Breakfast Cereal!");
		model.addAttribute("cereals", this.cerealRepository.findAll());
		return "cerealPage.html";
	
	}
	
	@GetMapping("/view/{cerealId}")
	public String viewPassenger(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Cereal View!");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		return "viewPage.html";
	
	}
	
	@GetMapping("/add")
	public String addCereal(Model model) {
		model.addAttribute("pageTitle", "Cereal Add!");
		model.addAttribute("cereal", new Cereal());
		return "editPage.html";
	}
	
	@GetMapping("/edit/{cerealId}")
	public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Edit Cereal!");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		return "editPage.html";
	}

	@PostMapping("/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "editPage.html";
		} else {
			Cereal savedCereal = this.cerealRepository.save(cereal);
			return "redirect:/view/" + cereal.getCerealId();
		}
	}
	
	@GetMapping("/delete/{cerealId}")
	public String deleteCereal(@PathVariable("cerealId") Integer cerealId, Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successfully deleted cereal!");
		this.cerealRepository.deleteById(cerealId);
		return "redirect:/cereal";
	
	}

}
