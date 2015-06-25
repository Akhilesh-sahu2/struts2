package com.psl;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class LoginFormAction extends ActionSupport {
	
static final Map localess = new HashMap();
	
	static {
		localess.put("en_US", "English");
		localess.put("es_SP", "Spanish");
	}
	
	public Map getLocaless(){
		return localess;
	}
	
	public String execute() {
		
	//	throw new FileNotFoundException("Error"); example to show global error
		return SUCCESS;
	}
	
	public String add(){
		System.out.println("Inside add method of LoginFormAction");
		return SUCCESS;
	}
	
	public String delete(){
		System.out.println("Inside delete method of LoginFormAction");
		return SUCCESS;
	}
}
