package com.tarena.PMP.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home( Model model ) throws Exception{
		model.addAttribute("message", "PMP");
		return "login";
	}
	@RequestMapping("/home/{nav}")
	public String home( @PathVariable String nav, Model model ) throws Exception{
		return nav;
	}
}
