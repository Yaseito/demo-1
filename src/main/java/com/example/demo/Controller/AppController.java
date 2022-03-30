package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String hello() {
		return "index";
	}
	
	@GetMapping("/users")
	public String user() {
		return "index";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "index";
	}
	
}

