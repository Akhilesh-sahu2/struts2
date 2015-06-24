package com.psl;

public class User {
	
	private String userName;
	private String password;
	public String getUserName() {
		System.out.println("Username = "+userName);
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("Username = "+userName);
		this.userName = userName;
	}
	public String getPassword() {
		System.out.println("password = "+password);
		return password;
	}
	public void setPassword(String password) {
		System.out.println("password = "+password);
		this.password = password;
	}
	

}
