package edu.upo.lhiddt.tfg.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.upo.lhiddt.tfg.application.service.FirstService;

@Controller	
public class RootController {
	
	private final FirstService firstService;
	
	public RootController(FirstService firstService) {
		this.firstService=firstService;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	public String rootEndPoint(Model model) {
		
		
		return firstService.jsonObj();
	}

}
