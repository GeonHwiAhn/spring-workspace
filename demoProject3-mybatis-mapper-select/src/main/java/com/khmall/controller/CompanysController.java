package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Companys;
import com.khmall.service.CompanysService;

@Controller
public class CompanysController {
	@Autowired
	private CompanysService companyService;
	
	@GetMapping("/allCompany")
	public String getAllCompanys(Model model) {
		List<Companys> companyList = companyService.getAllCompanys();
		
		model.addAttribute("companyList", companyList);
		
		return "companyList";
	}
}
