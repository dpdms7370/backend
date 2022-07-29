package com.myshop.dto;

/**
 * @author pc4
 *
 */
/**
 * @author pc4
 *
 */
public class BoardDTO {

	private int bno; // 게시판 글번호
	private String btitle; // 게시판 글 제목
	private String bcontent; // 게시판 글 요약 머리
	private String bwriter; // 글 작성자
	private String bdate;  // 글 작성일
	private String bpw; // 글 비밀번호
	private String bimg; // 첨부이미지
	private int visited; //방문자 수
	private String regdate; // 등록일자
	
	
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getBpw() {
		return bpw;
	}
	public void setBpw(String bpw) {
		this.bpw = bpw;
	}
	public String getBimg() {
		return bimg;
	}
	public void setBimg(String bimg) {
		this.bimg = bimg;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
	
}
