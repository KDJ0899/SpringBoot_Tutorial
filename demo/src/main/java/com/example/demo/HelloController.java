package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.T_listDTO;
import com.example.demo.service.DbService;

@Controller
public class HelloController {
	
	@Autowired
	DbService dbService;

	@RequestMapping("/")
	public String Hello(HttpServletResponse response) throws IOException{
		response.getWriter().print("Hello my name is Kim DongJin");
		
		return "welcome";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
		}
	
	@RequestMapping("/dbTest")
	public ModelAndView dbTest() throws Exception {
		
		List<T_listDTO> list = new ArrayList<T_listDTO>();
		list = dbService.getList();
		
		return new ModelAndView("dbTest","list",list);
		
	}
}
