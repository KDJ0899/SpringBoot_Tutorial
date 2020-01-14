package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String Hello(HttpServletResponse response) throws IOException{
		response.getWriter().print("Hello my name is Kim DongJin");
		
		return "welcome";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
		}
}
