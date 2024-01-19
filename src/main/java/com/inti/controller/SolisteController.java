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

import com.inti.model.Soliste;
import com.inti.service.ISolisteService;

@Controller
@RequestMapping("soliste")
public class SolisteController {
	
	@Autowired
	ISolisteService iss;
	
	//ok
	@GetMapping("formSoliste")
	public String getFormSoliste() {
		return "affichageSoliste";
	}
	
	//ok
	@GetMapping("getAll")
	public String getAll(Model m){
		List<Soliste> solistes= iss.getAllSoliste();
		m.addAttribute("solistes",solistes);
		return "affichageSoliste";
	}
	
	//ok
	@PostMapping("saveSoliste")
	public String saveSoliste(@ModelAttribute("soliste") Soliste soliste) {
		iss.save(soliste);
		return "redirect:/soliste/getAll";
	}
	
	//ok
	@GetMapping("getSoliste/{num}")
	public String getSoliste(@PathVariable("num") int num, Model m){
		Optional<Soliste> soliste = iss.getSoliste(num);
		m.addAttribute("soliste", soliste);
		return "affichageSoliste";
	}
	
	//a améliorer
	@PutMapping("updateSoliste")
	public String updateSoliste(@ModelAttribute("soliste") Soliste soliste) {
		iss.updateSoliste(soliste);
		return "affichageSoliste";
	}
	
	//ok
	@GetMapping("deleteSoliste")
	public String deleteSoliste(@RequestParam(value ="numSoliste") int num) {
		iss.deleteSoliste(num);
		return "redirect:/soliste/getAll";
	}
}
