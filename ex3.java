package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex3 {
	
	@GetMapping("/b")
	public String getMyFav() {
		String yourFavColor="Blue";
		return "My favorite color is " + yourFavColor;
	}

}