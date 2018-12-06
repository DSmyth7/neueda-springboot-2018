package uk.ac.belfastmet.dwarf.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
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
		model.addAttribute("pageTitle", "All Dwarfs!");
		model.addAttribute("headingOne", "");
		model.addAttribute("dwarfs", this.dwarfRepository.findAll());
		return "dwarf.html";

	}

	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		model.addAttribute("pageTitle", "View!");
		model.addAttribute("headingOne", "");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		return "view.html";

	}

	@GetMapping("/add")
	public String addDwarf(Model model) {
		model.addAttribute("pageTitle", "Add Dwarf!");
		model.addAttribute("headingOne", "");
		model.addAttribute("dwarf", new Dwarf());
		return "edit.html";
	}
	
	@GetMapping("/edit/{dwarfId}")
	public String editDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		model.addAttribute("pageTitle", "Edit Dwarf!");
		model.addAttribute("headingOne", "");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		return "edit.html";
	}

	@PostMapping("/save")
	public String saveDwarf(@Valid Dwarf dwarf, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "edit.html";
		} else {
			Dwarf savedDwarf = this.dwarfRepository.save(dwarf);
			return "redirect:/view/" + dwarf.getDwarfId();
		}
	}

	@GetMapping("/delete/{dwarfId}")
	public String deleteDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model,
			RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successfully deleted dwarf!");
		this.dwarfRepository.deleteById(dwarfId);
		return "redirect:/dwarfs";

	}

}
