package com.Security.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@RequestMapping("/")
	public String home()
	{
		return "welcome";
	}
	@RequestMapping("/user")
	public String user()
	{
		return "welcomeUser";
	}
	@RequestMapping("/admin")
	public String admin()
	{
		return "welcomeAdmin";
	}
}
