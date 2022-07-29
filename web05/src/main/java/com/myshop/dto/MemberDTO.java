package com.myshop.dto;

public class MemberDTO {
	// c = customer
	private int cno;  // 고객번호
	private String cid ; // 고객아이디
	private String	cpw ; //고객 비밀번호
	private String	cpw2 ; //고객 비밀번호 확인
	private String	cname ; //고객이름
	private String	cbirth ; // 고객생일
	private String	ctel ;  // 고객 전화번호
	private String	cmail; // 고객 이메일
	private String	cadd1 ; // 고객 주소
	private String	cadd2 ; // 고객 주소2 
	private int  grade;
	private String regdate;
	
	private boolean member_cid_exist;
	//public final static MemberDTO MEMBER_LOGIN;
	
	
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
	public String getCpw() {
		return cpw;
	}
	public void setCpw(String cpw) {
		this.cpw = cpw;
	}
	public String getCpw2() {
		return cpw2;
	}
	public void setCpw2(String cpw2) {
		this.cpw2 = cpw2;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCbirth() {
		return cbirth;
	}
	public void setCbirth(String cbirth) {
		this.cbirth = cbirth;
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
	public boolean isMember_id_exist() {
		return member_cid_exist;
	}
	public void setMember_id_exist(boolean member_cid_exist) {
		this.member_cid_exist = member_cid_exist;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	

}
