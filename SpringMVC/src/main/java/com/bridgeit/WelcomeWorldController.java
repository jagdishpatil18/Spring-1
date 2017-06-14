package com.bridgeit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/xyz")
public class WelcomeWorldController {

	@RequestMapping("/welcome")
	public ModelAndView hellWorld(){
		String message = "This is welcome page";
		return new ModelAndView("welcomepage", "message2", message);}
}
