package org.meeting.web;

import java.util.Random;

import javax.inject.Inject;

import org.meeting.service.MailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@Inject
	private MailService mailService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model)throws Exception {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String onUser = authentication.getName();
		model.addAttribute("onUser",onUser );
		return "home";
	}
    @ResponseBody
	@RequestMapping(value = "/sendMail/auth", method = RequestMethod.POST)
    public ResponseEntity<String> sendMailAuth(String username) {
    	//String email = username + "@hansung.ac.kr";
    	String email = username + "@naver.com";
		int ran = new Random().nextInt(100000) + 10000; // 10000 ~ 99999
        String joinCode = String.valueOf(ran);
        String subject = "인증 코드 발급 안내 입니다.";
        StringBuilder sb = new StringBuilder();
        sb.append("귀하의 인증 코드는 [" + joinCode + "] 입니다.");
        if(mailService.send(subject, sb.toString(), "hansungmeeting@gmail.com", email, null))
		return new ResponseEntity<>(joinCode,HttpStatus.CREATED);
        else{
        	return new ResponseEntity<>("FAIL",HttpStatus.BAD_REQUEST);
        }
    }
    
	
}
