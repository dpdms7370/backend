package com.myshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myshop.dto.MemberDTO;
import com.myshop.dto.PaymentDTO;
import com.myshop.service.PaymentService;

@Controller
@RequestMapping("/payment/")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="list.do", method = RequestMethod.GET)
    public String paymentList(Model model) throws Exception {
		MemberDTO user = (MemberDTO) session.getAttribute("member");
		String cid = user.getCid();
		List<PaymentDTO> paymentList = paymentService.paymentList(cid);
		model.addAttribute("paymentList", paymentList);
        return "payment/paymentList";
    }
}