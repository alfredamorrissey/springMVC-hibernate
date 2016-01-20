package com.alithya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alithya.domain.RFP;
import com.alithya.service.RFPService;

@Controller
public class RFPController {
	@Autowired
	private RFPService rfpService;
	
	@RequestMapping("/rfp/list")
	public void rfpList(Model model) {
		List<RFP> rfpList = rfpService.findAll();
		model.addAttribute("rfpList",rfpList);
	}

}
