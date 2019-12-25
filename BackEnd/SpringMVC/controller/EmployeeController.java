package com.cap.empspringmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.cap.empspringmvc.beans.EmployeeBean;
import com.cap.empspringmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String login(String email,String password,ModelMap map,HttpServletRequest request) {
		EmployeeBean bean=service.auth(email, password);
		if(bean==null) {
			map.addAttribute("msg","Invalid credentials");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/home")
	public String home(@SessionAttribute(name="bean",required = false)EmployeeBean bean) {
		if(bean!=null) {
			return "home";
		} else {
			return "login";
		}

	}
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {
		boolean check=service.register(bean);
		if(check) {
			map.addAttribute("msg","Employee registered");
		} else {
			map.addAttribute("msg","This email is already exist");
		}
		return "login";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap map) {

		session.invalidate();
		map.addAttribute("msg","logged out");
		return "login";
	}

	@GetMapping("/changepassword")
	public String changepassword(@SessionAttribute(name="bean",required = false)EmployeeBean bean) {
		if(bean!=null) {
			return "changepassword";
		} else {
			return "login";
		}
	}

	@PostMapping("/changepassword")
	public String changepassword(@SessionAttribute("bean")EmployeeBean bean,
			String password,ModelMap map) {
		service.changePassword(bean.getEid(), password);
		map.addAttribute("msg","Password updated");
		return "home";
	}

	@GetMapping("/search")
	public String search(@RequestParam("key") String key,ModelMap map,
			@SessionAttribute(name="bean",required = false) EmployeeBean bean) {
		if(bean!=null) {
			List<EmployeeBean> l1=service.getAllEmployees(key);
			map.addAttribute("list",l1); 
			return "home"; }
		else {
			return "login";
		} }
}
