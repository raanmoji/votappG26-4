package com.example.demo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class palControlador {
	
	@GetMapping("/index")
	public String inicio() {
		return "/index";
		
	}
	

}
