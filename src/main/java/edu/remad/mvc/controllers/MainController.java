package edu.remad.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.remad.mvc.services.GreetingService;

@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	public GreetingService greetingService;

	@RequestMapping("/")
	public String message(Model model) {
		model.addAttribute("message", greetingService.greet());
		
		return "hello";
	}
}
