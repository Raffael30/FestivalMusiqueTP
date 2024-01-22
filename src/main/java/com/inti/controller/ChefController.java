package com.inti.controller;

import com.inti.model.Chef;
import com.inti.model.Soliste;
import com.inti.service.IChefService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("chef")
public class ChefController {
	
	@Autowired
	IChefService ics;
	
	@GetMapping("formChef")
	public String getFormChef(){
		return "formulaireChef";
	}
	
	@GetMapping("getAll")
	public String getAll(Model m) {
		m.addAttribute("chefs", ics.getAllChef());
		m.addAttribute("countChef", ics.getChefCount());
		return "affichageChef";
	}
	
	@PostMapping("saveChef")
	public String saveChef(@ModelAttribute("chef") Chef chef) {
		ics.saveChef(chef);
		return "redirect:/chef/getAll";
	}
	
	@GetMapping("getChef/{num}")
	public String getChef(@PathVariable("num") long num, Model m) {
		m.addAttribute("chef", ics.getChef(num));
		return "affichageChef";
	}
	
	@GetMapping("modificationChef/{num}")
	public String updateChef(@PathVariable(value="num" ) long num, Model s) {
		Chef c = ics.getChef(num);
		s.addAttribute("c", c);
		return "formulaireChefUpdate";
	}
	
	@PostMapping("updateChef")
	public String updateChef(@ModelAttribute("chef") Chef chef) {
		ics.updateChef(chef);
		return "redirect:/chef/getAll";
	}
	
	@GetMapping("deleteSoliste")
	public String deleteSoliste(@RequestParam(value = "numChef") long num) {
		ics.deleteChef(num);
		return "redirect:/chef/getAll";
	}

}
