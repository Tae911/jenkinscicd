package com.tae9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MainController {
	@GetMapping
	public String intro(Model model) {
		model.addAttribute("greeting", "안녕하세요");
		return "intro";
	}
}
