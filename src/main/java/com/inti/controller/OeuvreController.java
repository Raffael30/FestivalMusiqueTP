package com.inti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.model.Oeuvre;
import com.inti.service.IOeuvreService;
import com.inti.service.IOeuvreServiceImpl;

@Controller
@RequestMapping("oeuvre")
public class OeuvreController {

	@Autowired
	IOeuvreService ios;

	@GetMapping("formOeuvre")
	public String getFormOeuvre() {
		return "affichageOeuvre";
	}

	@GetMapping("getAll")
	public String getAll(Model m) {
		List<Oeuvre> oeuvres = ios.getAllOeuvre();
		m.addAttribute("oeuvres", oeuvres);
		return "affichageOeuvre";
	}

	@PostMapping("saveOeuvre")
	public String saveOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre) {
		ios.saveOeuvre(oeuvre);
		return "redirect:/oeuvre/getAll";
	}

	@GetMapping("getOeuvre/{num}")
	public String getOeuvre(@PathVariable("num") long num, Model m) {
		Oeuvre oeuvre = ios.getOeuvre(num);
		m.addAttribute("oeuvre", oeuvre);
		return "affichageOeuvre";
	}

	@PutMapping("updateOeuvre")
	public String updateOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre) {
		ios.updateOeuvre(oeuvre);
		return "affichageOeuvre";
	}

	@GetMapping("deleteOeuvre")
	public String deleteOeuvre(@RequestParam(value = "numOeuvre") long num) {
		ios.deleteOeuvre(num);
		return "redirect:/oeuvre/getAll";
	}
}
