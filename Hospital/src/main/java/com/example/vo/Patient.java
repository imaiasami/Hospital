package com.example.vo;

public class Patient {
	private int seq_pat;
	private String name;
	private String phone;
	private String ssn;
	
	public Patient() {}

	public Patient(String name, String phone, String ssn) {
		this.name = name;
		this.phone = phone;
		this.ssn = ssn;
	}

	public int getSeq_pat() {
		return seq_pat;
	}
	public void setSeq_pat(int seq_pat) {
		this.seq_pat = seq_pat;
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
		return "이름: " + name + ", 전화번호: " + phone + ", 생년월일" + getBirth() + ", 성별: " + getGender();
	}

}