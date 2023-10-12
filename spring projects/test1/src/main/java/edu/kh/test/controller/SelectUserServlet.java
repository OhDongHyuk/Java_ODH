package edu.kh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kh.test.model.vo.UserDTO;
import kr.kh.spring.util.Message;

@Controller
public class SelectUserServlet {
	
	@RequestMapping(value="/views/searchSuccess", method=RequestMethod.POST)
	public String susseccPost(UserDTO USER, Model model) {
		
		if(memberService.signup(member)) {
			msg = new Message("/", "회원 가입에 성공했습니다.");
		}
		model.addAttribute("msg", msg);
		return "message";
	}
	
