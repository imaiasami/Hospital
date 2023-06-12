package com.example.vo;

public class Doctor {
	private int seq_doc;
	private String name;
	private String phone;
	private String dept;
	private String post;
	private String ssn;
	
	public Doctor () {}
	
	public Doctor(String name, String phone, String dept, String post, String ssn) {
		this.name = name;
		this.phone = phone;
		this.dept = dept;
		this.post = post;
		this.ssn = ssn;
	}

	public int getSeq_doc() {
		return seq_doc;
	}
	public void setSeq_doc(int seq_doc) {
		this.seq_doc = seq_doc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getGender() {
		if (ssn == null || ssn.equals("")) return null;
		String gender = ssn.substring(7, 8);
		switch (gender) {
			case "1" : case "3" : case "5" : case "7" : case "9" : return "Male";
			case "2" : case "4" : case "6" : case "8" : case "0" : return "Female";
			default : return null;
		}
	}
	public String getBirth() {
		if (ssn == null || ssn.equals("")) return null;
		String gender = ssn.substring(7, 8);
		String cent = "";
		switch (gender) {
			case "1" : case "2" : case "5" : case "6" : cent = "19"; break;
			case "3" : case "4" : case "7" : case "8" : cent = "20"; break;
			case "9" : case "0" : cent = "18"; break;
		}
		String birth = ssn.substring(0, 6).replaceAll("(?<=^([0-9]{2}){1,2})\\B", "-");
		return cent + birth;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 전화번호: " + phone + ", 소속: " + dept + ", 직책: " + post
				+ ", 생년월일: " + getBirth() + ", 성별: " + getGender();
	}

}