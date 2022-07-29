package com.myshop.dao;

import java.util.List;

import com.myshop.dto.MemberDTO;

public interface MemberDAO {
	public void joinMember(MemberDTO member) throws Exception;
	public MemberDTO loginMember(MemberDTO member) throws Exception;
	public void deleteMember(MemberDTO member) throws Exception;
	public int checkExistMember(String cid) throws Exception;
	public void updateMember(MemberDTO member) throws Exception;
	public List<MemberDTO> memberList() throws Exception;
}