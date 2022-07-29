package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public void joinMember(MemberDTO member) throws Exception {
		sqlSession.insert("member.joinMember", member);
	}

	@Override
	public MemberDTO loginMember(MemberDTO member) throws Exception {
		return sqlSession.selectOne("member.loginMember", member);
	}

	@Override
	public void deleteMember(MemberDTO member) throws Exception {
		String cid = member.getCid();
		sqlSession.delete("member.deleteMember", cid);
	}
	@Override
	public void updateMember(MemberDTO member) throws Exception {
		sqlSession.update("member.updateMember", member);
	}

	@Override
	public int checkExistMember(String cid) throws Exception {
		return sqlSession.selectOne("member.checkExistMember", cid);
	}

	@Override
	public List<MemberDTO> memberList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
	}	
}
