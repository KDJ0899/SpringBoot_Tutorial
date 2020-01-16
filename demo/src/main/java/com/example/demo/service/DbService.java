package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.Mapper;
import com.example.demo.dto.T_listDTO;

public class DbService {
	
	@Autowired
	Mapper mapper;
	
	public List<T_listDTO> getList() throws Exception{
	        
	       return mapper.getList();
	        
	   }

}
