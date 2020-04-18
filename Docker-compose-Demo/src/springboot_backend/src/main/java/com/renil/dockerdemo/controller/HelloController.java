package com.renil.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dockerdemo")
public class HelloController {

	@GetMapping("/hello")
	public String sayHii() {
		return "Hello Docker";
	}
}
