package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.BoardDAO;
import com.myshop.dto.BoardDTO;
import com.myshop.util.PageMaker;


@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDAO;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.boardList();
	}

	@Override
	public List<BoardDTO> boardPageList(PageMaker page) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.boardPageList(page);
	}

	@Override
	public BoardDTO boardRead(int bno) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.boardRead(bno);
	}

	@Override
	public int boardCount() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.boardCount();
	}

	@Override
	public void addBoard(BoardDTO board) throws Exception {
		boardDAO.addBoard(board);
		
	}

	@Override
	public void deleteBoard(BoardDTO board) throws Exception {
		boardDAO.deleteBoard(board);
		
	}

	@Override
	public void updateBoard(BoardDTO board) throws Exception {
		boardDAO.updateBoard(board);
		
	}
	
	
	
	

}
