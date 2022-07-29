package com.myshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myshop.dto.ProductDTO;
import com.myshop.service.LatestService;

@Controller
@RequestMapping("/latest/")
public class LatestController {
	
	@Autowired
	LatestService latestservice;
	
	@RequestMapping(value="latestProduct")
	public List<ProductDTO> latestProducts() throws Exception {
		return latestservice.latestProducts();		
	}
	
	@RequestMapping(value="bestProduct")
	public List<ProductDTO> bestProducts() throws Exception {	
		return latestservice.bestProducts();	
	}
	
	@RequestMapping(value="")
	public List<ProductDTO> chuProducts() throws Exception {
		return latestservice.chuProducts();	
	}
	

	
	
}
