package com.myshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myshop.dto.MemberDTO;
import com.myshop.dto.ProductDTO;
import com.myshop.service.MemberService;
import com.myshop.service.ProductService;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	ProductService productservice;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@Autowired
	HttpSession session;
	
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String adminRoot() {
        return "admin/admin";
    }
	
    @RequestMapping(value="admin.do", method = RequestMethod.GET)
    public String admin() {
        return "admin/admin";
    }
    

    @RequestMapping(value="deleteProductForm.do", method = RequestMethod.GET)
    public String deleteProductFrom(Model model) throws Exception {
        return "admin/productDeleteForm";
    }
    
    
    
    @RequestMapping(value="deleteProduct.do", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam("pcode") String pcode, Model model) throws Exception {
		ProductDTO product = new ProductDTO();
		product.setPcode(pcode);
		productservice.deleteProduct(product);
		return "redirect:/admin/productDelete";		
    }
    
	@RequestMapping(value = "list.do", method = RequestMethod.GET)
	public String memberList(Model model) throws Exception {
		List<MemberDTO> memberList = memberService.memberList();
		model.addAttribute("memberList", memberList);
		return "admin/memberList";
	}
    
}