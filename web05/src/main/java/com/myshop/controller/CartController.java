package com.myshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myshop.dto.CartDTO;
import com.myshop.dto.MemberDTO;
import com.myshop.dto.ProductDTO;
import com.myshop.service.CartService;

@Controller
@RequestMapping("/cart/")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="cartList.do", method = RequestMethod.GET)
    public String cartList(Model model) throws Exception {
		MemberDTO user = (MemberDTO) session.getAttribute("member");
		String cid = user.getCid();		
			if(cid==null) {
				return "redirect:/"; 
			} else {			
			List<CartDTO> cartList = cartService.cartList(cid);
			model.addAttribute("cartList", cartList);
	        return "cart/cartList"; 
		}		
    }
	
	@RequestMapping(value = "addcart.do", method = RequestMethod.GET)
	public String addcart(CartDTO cart, Model model) throws Exception{
		cartService.addCart(cart);
		return "redirect:/cart/cartList.do";
	}
	
	@RequestMapping(value = "updateCart.do", method = RequestMethod.GET)
	public String updateCart(CartDTO cart, Model model) throws Exception{
		cartService.updateCart(cart);
		return "redirect:/cart/cartList.do";
	}
	
	@RequestMapping(value = "deleteCart.do", method = RequestMethod.GET)
	public String deleteCart(CartDTO cart, Model model) throws Exception{
		cartService.deleteCart(cart);
		return "redirect:/cart/cartList.do";
	}
	
	
}