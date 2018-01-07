package cn.com.studyshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.com.studyshop.service.LoginService;

@RestController
@RequestMapping("/service")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private RestTemplate restTemplate;

	// @GetMapping("/login")
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String service() {
		return loginService.service();
	}
}
