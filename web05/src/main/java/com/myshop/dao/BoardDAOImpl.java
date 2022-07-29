package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.BoardDTO;
import com.myshop.util.PageMaker;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.boardList");
	}

	@Override
	public List<BoardDTO> boardPageList(PageMaker page) throws Exception {
//		System.out.println("페이지 시작 글 : "+page.getStartPost());
//		System.out.println("한 페이지 글 개수 : "+page.getBnum());
		return sqlSession.selectList("board.boardPageList", page);
	}

	@Override
	public BoardDTO boardRead(int bno) throws Exception {
		sqlSession.update("board.viewCountUp", bno);
		return sqlSession.selectOne("board.boardRead", bno);
	}

	@Override
	public int boardCount() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.boardCount");
	}

	@Override
	public void addBoard(BoardDTO board) throws Exception {
		sqlSession.insert("board.addBoard", board);		
	}

	@Override
	public void deleteBoard(BoardDTO board) throws Exception {
		sqlSession.delete("board.deleteBoard", board);
		
	}

	@Override
	public void updateBoard(BoardDTO board) throws Exception {
		sqlSession.update("board.updateBoard", board);
		
	}	

}
