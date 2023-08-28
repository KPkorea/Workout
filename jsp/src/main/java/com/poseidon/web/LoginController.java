package com.poseidon.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.poseidon.web.dto.LoginDTO;
import com.poseidon.web.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String login(HttpServletRequest request) {
		// System.out.println(request.getParameter("id"));
		// System.out.println(request.getParameter("pw"));
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setId(request.getParameter("id"));
		loginDTO.setPw(request.getParameter("pw"));

		int result = loginService.login(loginDTO);

		System.out.println("로그인결과 : " + result);
		return "redirect:/board";
	}

}