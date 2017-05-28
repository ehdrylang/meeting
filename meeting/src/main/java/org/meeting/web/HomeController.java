package org.meeting.web;

import javax.inject.Inject;

import org.meeting.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@Inject
	private UserService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model)throws Exception {
	
		model.addAttribute("a",service.read("qjadud22"));
		return "home";
	}
}