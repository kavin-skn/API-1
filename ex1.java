package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ex1 {
	@RequestMapping("/")
	public String Welcome() { 
		return "Welcome String Boot!";
	}
	
	
}