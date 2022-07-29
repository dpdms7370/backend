package com.myshop.service;

import java.util.List;

import com.myshop.dto.MemberDTO;

public interface MemberService {
	public void joinMember(MemberDTO member) throws Exception;
	public MemberDTO loginMember(MemberDTO member) throws Exception;
	public void deleteMember(MemberDTO member) throws Exception;
	public int checkExistMember(String cid) throws Exception;
	public void updateMember(MemberDTO member) throws Exception;
	public List<MemberDTO> memberList() throws Exception;
	public boolean loginMemberTest(MemberDTO member) throws Exception;
}