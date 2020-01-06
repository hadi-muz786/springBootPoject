package com.abc.dto;

public class StudentDto {

	private Long id;
	private String name;
	private String phoNum;
	private String mail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoNum() {
		return phoNum;
	}

	public void setPhoNum(String phoNum) {
		this.phoNum = phoNum;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", phoNum=" + phoNum + ", mail=" + mail + "]";
	}
}
