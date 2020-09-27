package com.woniu.eneity;

public class Student {
	private Integer sid;
	private String sname;
	public Student() {
		super();
	}
	public Student(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
