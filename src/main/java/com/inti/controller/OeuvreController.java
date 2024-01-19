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

@Controller
@RequestMapping("oeuvre")
public class OeuvreController {

	@Autowired
	IOeuvreService ios;

	// ok
	@GetMapping("formOeuvre")
	public String getFormOeuvre() {
		return "affichageOeuvre";
	}

	// ok
	@GetMapping("getAll")
	public String getAll(Model m) {
		List<Oeuvre> oeuvres = ios.getAllOeuvre();
		m.addAttribute("oeuvres", oeuvres);
		return "affichageOeuvre";
	}

	// ok
	@PostMapping("saveOeuvre")
	public String saveOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre) {
		ios.save(oeuvre);
		return "redirect:/oeuvre/getAll";
	}

	// ok
	@GetMapping("getOeuvre/{num}")
	public String getOeuvre(@PathVariable("num") int num, Model m) {
		Optional<Oeuvre> oeuvre = ios.getOeuvre(num);
		m.addAttribute("oeuvre", oeuvre);
		return "affichageOeuvre";
	}

	// a améliorer
	@PutMapping("updateOeuvre")
	public String updateOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre) {
		ios.updateOeuvre(oeuvre);
		return "affichageOeuvre";
	}

	// marche pas
	@GetMapping("deleteOeuvre")
	public String deleteOeuvre(@RequestParam(value = "numOeuvre") int num) {
		ios.deleteOeuvre(num);
		return "redirect:/oeuvre/getAll";
	}
}
