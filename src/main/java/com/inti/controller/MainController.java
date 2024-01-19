package com.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("accueil")
	public String getAccueil() {
		return "accueil";
	}
}
