package com.myshop.dto;

public class PaymentDTO {
	
	
	private int payno; //결재번호
	private String paytool; // 결재수단
	private String paycost ; // 결재금액
	private String paydate ; // 결재일
	private int paynum ; //주문수량
	private String cid ; // 주문자
	private String ctel ; // 주문고객번호
	private String cmail ; // 주문고객이메일
	private String cadd1 ; // 배송지
	private String cadd2 ; // 상세배송지
	private int grade ; // 주문고객등급
	
	public int getPayno() {
		return payno;
	}
	public void setPayno(int payno) {
		this.payno = payno;
	}
	public String getPaytool() {
		return paytool;
	}
	public void setPaytool(String paytool) {
		this.paytool = paytool;
	}
	public String getPaycost() {
		return paycost;
	}
	public void setPaycost(String paycost) {
		this.paycost = paycost;
	}
	public String getPaydate() {
		return paydate;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	public int getPaynum() {
		return paynum;
	}
	public void setPaynum(int paynum) {
		this.paynum = paynum;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	public String getCadd1() {
		return cadd1;
	}
	public void setCadd1(String cadd1) {
		this.cadd1 = cadd1;
	}
	public String getCadd2() {
		return cadd2;
	}
	public void setCadd2(String cadd2) {
		this.cadd2 = cadd2;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

	
	
	
}
