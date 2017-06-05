package org.meeting.web;

import javax.inject.Inject;

import org.meeting.domain.UserVO;
import org.meeting.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user/*")
public class UserController {
	@Inject
	private UserService service;
	

	@RequestMapping(value="/signup" ,method=RequestMethod.GET)
	public void registerGET(UserVO vo, Model model)throws Exception{
		
	}
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String registPOST(UserVO vo, RedirectAttributes rttr)throws Exception{
		service.regist(vo);	
		rttr.addFlashAttribute("msg","success");
		return "redirect:/";
	}
	@ResponseBody
	@RequestMapping(value = "/signUpIdCheck", method = RequestMethod.POST)
    public ResponseEntity<String> idcheck(String username)throws Exception{
		System.out.println(service.read(username));
		if(service.read(username)==null){
			return new ResponseEntity<>("SUCCESS",HttpStatus.OK);
		}
		else{
			return new ResponseEntity<>("FAIL",HttpStatus.OK);
		}
	}
}
