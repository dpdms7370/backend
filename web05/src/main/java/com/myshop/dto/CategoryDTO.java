package com.myshop.dto;

public class CategoryDTO {
	private String cname; // 이름
	private String ccode; // 장바구니 코드
	private String ccoderef; // 으음?
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getCcoderef() {
		return ccoderef;
	}
	public void setCcoderef(String ccoderef) {
		this.ccoderef = ccoderef;
	}
}