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

import com.inti.model.Lieu;
import com.inti.service.ILieuService;

@Controller
@RequestMapping("lieu")
public class LieuController {
	
	@Autowired
	private ILieuService ils;
	
	

	@GetMapping("formLieu")
	public String getFormLieu() {
		return "affichageLieu";
	}

	@GetMapping("getAll")
	public String getAll(Model m) {
		List<Lieu> lieux = ils.getAllLieu();
		m.addAttribute("lieux", lieux);
		return "affichageLieux";
	}

	@PostMapping("saveLieu")
	public String saveLieu(@ModelAttribute("lieu") Lieu lieu) {
		ils.saveLieu(lieu);
		return "redirect:/lieu/getAll";
	}

	@GetMapping("getLieu/{num}")
	public String getLieu(@PathVariable("num") long num, Model m) {
		Lieu lieu = ils.getLieu(num);
		m.addAttribute("lieu", lieu);
		return "affichageLieu";
	}

	@PutMapping("updateLieu")
	public String updateLieu(@ModelAttribute("lieu") Lieu lieu) {
		ils.updateLieu(lieu);
		return "affichageLieu";
	}

	@GetMapping("deleteLieu")
	public String deleteLieu(@RequestParam(value = "numLieu") long num) {
		ils.deleteLieu(num);
		return "redirect:/Lieu/getAll";
	}
	
	
	
	
	
	
	

}
 