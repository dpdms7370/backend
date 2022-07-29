package com.myshop.dto;

public class ProductDTO {

	private int pno; // 상품번호
	private String pcode; // 상품코드
	private String pname ; // 상품명
	private String pcost ; // 상품가격
	private String pcok ; // 상품설명
	private int pamunt ; // 상품수량
	private String pimg1; // 상품이미지1
	private String pimg2 ; // 상품이미지2
	private String come; //입고일 
	
	
	
	
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcost() {
		return pcost;
	}
	public void setPcost(String pcost) {
		this.pcost = pcost;
	}
	public String getPcok() {
		return pcok;
	}
	public void setPcok(String pcok) {
		this.pcok = pcok;
	}
	public int getPamunt() {
		return pamunt;
	}
	public void setPamunt(int pamunt) {
		this.pamunt = pamunt;
	}
	public String getPimg1() {
		return pimg1;
	}
	public void setPimg1(String pimg1) {
		this.pimg1 = pimg1;
	}
	public String getPimg2() {
		return pimg2;
	}
	public void setPimg2(String pimg2) {
		this.pimg2 = pimg2;
	}
	public String getCome() {
		return come;
	}
	public void setCome(String come) {
		this.come = come;
	}
	
	
	
}
