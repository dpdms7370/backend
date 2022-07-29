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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myshop.dto.MemberDTO;
import com.myshop.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@Autowired
	HttpSession session;
	

	
    @RequestMapping(value="joinForm.do", method = RequestMethod.GET)
    public String memberForm() {
        return "member/joinForm";
    }
  
    @RequestMapping(value="joinPro.do", method = RequestMethod.POST)
	public String joinmember(MemberDTO member) throws Exception {
    	String reqpass = member.getCpw();
    	String cpw = passEncoder.encode(reqpass);
    	member.setCpw(cpw);
		memberService.joinMember(member);		
		return "member/joinSuccess";
	}
    
    @RequestMapping(value="checkExistMember.do", method = RequestMethod.POST)
    @ResponseBody
    public String checkExistMember(@RequestParam("cid") String cid, MemberDTO member, RedirectAttributes rttr) throws Exception {
    	int cnt = memberService.checkExistMember(cid);
    	String result = "";
    	if(cnt>0) {
    		result="false";
        	rttr.addAttribute("msg", false);
    	} else {
    		result="true";
        	rttr.addAttribute("msg", true);
    	}
    	rttr.addAttribute("result", result);
    	return result;
    }
     
    @RequestMapping(value="loginForm.do", method = RequestMethod.GET)
    public String loginForm() {
        return "member/loginForm";
    }
    
    
    @RequestMapping(value="mypage.do", method = RequestMethod.GET)
    public String mypage(MemberDTO member) {
        return "member/mypage";
    }
    
    @RequestMapping(value="loginPro.do", method=RequestMethod.POST)
	public String loginpro(MemberDTO member, RedirectAttributes rttr) throws Exception {
    		MemberDTO login = memberService.loginMember(member);    		
    		boolean passMatch = passEncoder.matches(member.getCpw(), login.getCpw());
    		if(login != null && passMatch==true) {
    			session.setAttribute("member", login);
    			session.setAttribute("cid", member.getCid());
  
    			return "redirect:/";
    		} else {
    			session.setAttribute("member", null);
    			rttr.addFlashAttribute("msg", false);
    			return "redirect:loginForm.do";
    		}
	}
    @RequestMapping(value="logout.do", method = RequestMethod.GET)
    public String logout(HttpSession session) {
    	session.invalidate();
        return "redirect:/";
    }

    @RequestMapping(value="deleteMember.do", method = RequestMethod.GET)
    public String deleteMember(MemberDTO member) throws Exception {
    	MemberDTO dto = (MemberDTO) session.getAttribute("member");
		memberService.deleteMember(dto);
		session.setAttribute("member", null);
		session.invalidate();
		return "redirect:/member/logout.do";
    }
    
    @RequestMapping(value="updateMember.do", method = RequestMethod.GET)
	public String updateForm(MemberDTO member) {
		return "member/update";
	}
    
    @RequestMapping(value="updatePro.do", method = RequestMethod.POST)
	public String updateMember(MemberDTO member) throws Exception {
    	String reqpass = member.getCpw();
    	String cpw = passEncoder.encode(reqpass);
    	member.setCpw(cpw);
    	memberService.updateMember(member);
		return "redirect:/";
	}
}
