package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebController implements WebMvcConfigurer{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/user").setViewName("user");
	}
	
	@GetMapping("/")
	public String showForm(User user) {
		return "form";
	}
	
	@PostMapping("/")
	public String checkUserInfo(@Valid User user, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) {
			return "form";
		}
		return "redirect:/user";
	}
}
