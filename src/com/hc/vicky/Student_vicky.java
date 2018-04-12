package com.hc.vicky;

public class Student_vicky {
	public String stu_name;
	public String stu_word;
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_word() {
		return stu_word;
	}
	public void setStu_word(String stu_word) {
		this.stu_word = stu_word;
	}
	@Override
	public String toString() {
		return "Student_vicky [stu_name=" + stu_name + ", stu_word=" + stu_word + "]";
	}
	public Student_vicky(String stu_name, String stu_word) {
		super();
		this.stu_name = stu_name;
		this.stu_word = stu_word;
	}
	
}
