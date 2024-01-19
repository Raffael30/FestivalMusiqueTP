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

import com.inti.model.Concert;
import com.inti.service.IConcertService;

@Controller
@RequestMapping("concert")
public class ConcertController {

	@Autowired
	IConcertService ics;

	@GetMapping("formConcert")
	public String getFormConcert() {
		return "affichageConcert";
	}

	@GetMapping("getAll")
	public String getAll(Model m) {
		List<Concert> concerts = ics.getAllConcert();
		long concertCount = ics.getConcertCount();
		m.addAttribute("concerts", concerts);
		m.addAttribute("concertCount", concertCount);
		return "affichageConcert";
	}

	@PostMapping("saveConcert")
	public String saveConcert(@ModelAttribute("concert") Concert concert) {
		ics.saveConcert(concert);
		return "redirect:/Concert/getAll";
	}

	@GetMapping("getConcert/{num}")
	public String getConcert(@PathVariable("num") long num, Model m) {
		Concert concert = ics.getConcert(num);
		m.addAttribute("concert", concert);
		return "affichageConcert";
	}

	@PutMapping("updateConcert")
	public String updateConcerte(@ModelAttribute("concert") Concert concert) {
		ics.updateConcert(concert);
		return "affichageConcert";
	}

	@GetMapping("deleteConcert")
	public String deleteConcert(@RequestParam(value = "numConcert") long num) {
		ics.deleteConcert(num);
		return "redirect:/Concert/getAll";
	}
}
