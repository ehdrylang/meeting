package org.meeting.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}

