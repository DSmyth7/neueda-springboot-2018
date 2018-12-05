package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarf.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class ViewController {
	
	DwarfRepository dwarfRepository;
	
	
	public ViewController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/dwarfs")
	public String viewAllDwarf(Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("headingOne","");
		model.addAttribute("dwarfs", this.dwarfRepository.findAll());
		return "dwarf.html";
	
	}
	
	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("headingOne","");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		return "view.html";
	
	}
	
	@GetMapping("/delete/{dwarfId}")
	public String deleteDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successfully deleted dwarf!");
		this.dwarfRepository.deleteById(dwarfId);
		return "redirect:/dwarfs";
	
	}

}
