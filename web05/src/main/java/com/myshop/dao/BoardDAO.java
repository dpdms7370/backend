package com.myshop.dao;

import java.util.List;

import com.myshop.dto.BoardDTO;
import com.myshop.util.PageMaker;

public interface BoardDAO {
	
	public List<BoardDTO> boardList() throws Exception;
	public List<BoardDTO> boardPageList(PageMaker page) throws Exception;
	public BoardDTO boardRead(int bno) throws Exception;
	public int boardCount() throws Exception;
	public void addBoard(BoardDTO board) throws Exception; 
	public void deleteBoard(BoardDTO board) throws Exception;
	public void updateBoard(BoardDTO board) throws Exception;

}
