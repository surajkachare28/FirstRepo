package com.app.model;

public class Student {
	string address;
	private int rollno;
	private String name;
	private Address adr;

	public Student(int rollno, String name, Address adr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.adr = adr;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", adr=" + adr + "]";
	}
	
}
