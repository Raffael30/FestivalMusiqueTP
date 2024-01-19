package com.inti.controller;

import java.util.List;

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

	@GetMapping("formSoliste")
	public String getFormSoliste() {
		return "affichageSoliste";
	}

	@GetMapping("getAll")
	public String getAll(Model m){
		List<Soliste> solistes= iss.getAllSoliste();
		long solisteCount = iss.getSolisteCount();
		m.addAttribute("solistes",solistes);
		m.addAttribute("solisteCount",solisteCount);
		return "affichageSoliste";
	}

	@PostMapping("saveSoliste")
	public String saveSoliste(@ModelAttribute("soliste") Soliste soliste) {
		iss.saveSoliste(soliste);
		return "redirect:/soliste/getAll";
	}

	@GetMapping("getSoliste/{num}")
	public String getSoliste(@PathVariable("num") long num, Model m){
		Soliste soliste = iss.getSoliste(num);
		m.addAttribute("soliste", soliste);
		return "affichageSoliste";
	}


	@PutMapping("updateSoliste")
	public String updateSoliste(@ModelAttribute("soliste") Soliste soliste) {
		iss.updateSoliste(soliste);
		return "affichageSoliste";
	}

	@GetMapping("deleteSoliste")
	public String deleteSoliste(@RequestParam(value ="numSoliste") long num) {
		iss.deleteSoliste(num);
		return "redirect:/soliste/getAll";
	}
}
