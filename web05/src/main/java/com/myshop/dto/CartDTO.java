package com.myshop.dto;

public class CartDTO {
	private int cno;		//장바구니번호
	private String cid;	//사용자아이디
	private String pcode;		//상품코드
	private String pcolor;	//색상
	private int pamunt;		//수량
	private String getdate;	//장바구니 등록일
	
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPcolor() {
		return pcolor;
	}
	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}
	public int getPamunt() {
		return pamunt;
	}
	public void setPamunt(int pamunt) {
		this.pamunt = pamunt;
	}
	public String getGetdate() {
		return getdate;
	}
	public void setGetdate(String getdate) {
		this.getdate = getdate;
	}
	
	
}
