package com.jd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jd.dao.ServiceDao;

@Controller
public class LoginController {
	
	@Autowired
	ServiceDao dao;
	
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("showlogin")
	public String showlogin() {
		return "login";
	}
	
	@PostMapping("login")
	public String doLogin(HttpServletRequest req, HttpServletResponse resp, HttpSession session, Model model) {
		
		String userId = "123";
		String pass = "abc";
		if(req.getParameter("user").equals(userId) && req.getParameter("pass").equals(pass)) {
			session.setAttribute("userId", userId);
			model.addAttribute("userId", userId);
			model.addAttribute("roll", 1);	
			
			dao.insert();
			return "display";
		}
		return "login";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		if(session.getAttribute("userId") != null) {
			session.removeAttribute("userId");
			session.invalidate();
			return "logout";
		}		
		return "login";
	}
}
