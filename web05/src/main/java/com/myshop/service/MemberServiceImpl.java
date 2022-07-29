package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.MemberDAO;
import com.myshop.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;

	@Override
	public void joinMember(MemberDTO member) throws Exception {
		memberDAO.joinMember(member);
	}

	@Override
	public MemberDTO loginMember(MemberDTO member) throws Exception {
		return memberDAO.loginMember(member);
	}

	@Override
	public void deleteMember(MemberDTO member) throws Exception {
		memberDAO.deleteMember(member);
	}

	@Override
	public int checkExistMember(String cid) throws Exception {
		return memberDAO.checkExistMember(cid);
	}

	@Override
	public void updateMember(MemberDTO member) throws Exception {
		memberDAO.updateMember(member);
	}

	@Override
	public List<MemberDTO> memberList() throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.memberList();
	}

	@Override
	public boolean loginMemberTest(MemberDTO member) throws Exception {
		if(member.getCid().equals("admin") && member.getCpw().equals("1234")) {
			return true;	
		} else {
			return false;
		}
	}	
	
	
	

}
