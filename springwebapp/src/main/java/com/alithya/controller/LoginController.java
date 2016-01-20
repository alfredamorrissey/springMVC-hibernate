package com.alithya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alithya.domain.Member;
import com.alithya.service.MemberService;

@Controller
public class LoginController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/login")
	public void login(Model model) {
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String verifyCredentials(@ModelAttribute Member member) {
		member = memberService.login(member.getUsername(), member.getPassword());
		//Credentials are bad, redirect to the logon page
		if (member == null)
		{
			return "/login";
		}
		
		//We have a valid member, add to session here
		//todo: Add member to session
	 
		return "redirect:/rfp/list";
	 
	}

}
