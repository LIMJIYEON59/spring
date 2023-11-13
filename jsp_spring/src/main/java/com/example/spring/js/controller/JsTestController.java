package com.example.spring.js.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JsTestController {
	
	@GetMapping("/jstest01")
	public String jstest() {
		return "jstest01";
	}

}
