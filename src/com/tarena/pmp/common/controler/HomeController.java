package com.tarena.pmp.common.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tarena.pmp.util.Constants;


@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(HttpServletRequest request) throws Exception{
		if( request.getSession().getAttribute(Constants.USER_INFO_SESSION) != null )
			return "home";
		return "login";
	}
	@RequestMapping("/home/{nav}")
	public String home( @PathVariable String nav, HttpServletRequest request) throws Exception{
		if( nav.equals("login") && request.getSession().getAttribute(Constants.USER_INFO_SESSION) != null )
			return "redirect:/home";
		return nav;
	}
}
