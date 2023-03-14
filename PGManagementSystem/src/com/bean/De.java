package com.bean;

public  final class De {
	private String  name;
	private String email;
	private String mobile;
	private int id;
	private String aname;
	private String aemail;
	private String apassword;
	private String anumber;
	public De(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public De (int id,String name, String email, String mobile) {
		
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.id = id;
	}
	public De(String aname, String aemail, String apassword, String anumber) {
		super();
		this.aname = aname;
		this.aemail = aemail;
		this.apassword = apassword;
		this.anumber = anumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	public String getAnumber() {
		return anumber;
	}
	public void setAnumber(String anumber) {
		this.anumber = anumber;
	}
	
	

}

