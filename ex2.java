package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ex2 {
	private String studentName="MyName";
	@GetMapping("/a")
	public String getname() {
		return "Welcome"+studentName;
	}

}