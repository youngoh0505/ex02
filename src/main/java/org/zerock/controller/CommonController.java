package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {
	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model) {
		if(error !=null) {
			model.addAttribute("error","Login Error Check");
		}
		if(logout != null) {
			model.addAttribute("logout","LogOut!!!");
			}
		}
	
	
	@GetMapping("/customLogout")
	public void logoutGet() {
		
		
	}
	

}
