package com.REST_API.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/grid")
public class controller {
	
	@GetMapping
	public String getGrid() {
		return "hello, worid";
	}
	

}
