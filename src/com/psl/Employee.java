package com.psl;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Employee {

	private int id;
	private String fname;
	private String lname;
	private Double age;
	private Date birth;
	private List<String > cirtification;
	private Address address;
	private File cv;
	private String cvContentType;
	private String cvFileName;
	private String summary;
	private boolean hasResume;
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public boolean isHasResume() {
		return hasResume;
	}
	public void setHasResume(boolean hasResume) {
		this.hasResume = hasResume;
	}
	public File getCv() {
		return cv;
	}
	public void setCv(File cv) {
		this.cv = cv;
	}
	public String getCvContentType() {
		return cvContentType;
	}
	public void setCvContentType(String cvContentType) {
		this.cvContentType = cvContentType;
	}
	public String getCvFileName() {
		return cvFileName;
	}
	public void setCvFileName(String cvFileName) {
		this.cvFileName = cvFileName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("In Set address method ");
		
		this.address = address;
	}
	public List<String> getCirtification() {
		return cirtification;
	}
	public void setCirtification(List<String> cirtification) {
		this.cirtification = cirtification;
	}
	public Date getBirth() {
		return birth;
	}
	public Employee(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
}
