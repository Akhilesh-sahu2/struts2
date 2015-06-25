package com.psl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>, SessionAware{
static final Map localess = new HashMap();
private HttpSession session;
private Map<String, Object> sessionMap = new HashMap<String, Object>();
	
	static {
		localess.put("en_US", "English");
		localess.put("es_SP", "Spanish");
	}
	
	public Map getLocaless(){
		return localess;
	}
	
	private Employee  emp = new Employee();
	public Employee getModel() {
		// TODO Auto-generated method stub
		return emp;
	}
//	@Override
//	public void validate() {
//		System.out.println("Inside Employee Validate");
//		if(emp.getId()==0)
//			addFieldError("id", getText("id.required"));
//		if(emp.getAge()==0.0)
//			addFieldError("age", getText("age.required"));
//		if(emp.getFname().length()==0)
//			addFieldError("fname", getText("fname.required"));
//		if(emp.getLname().length()==0)
//			addFieldError("lname", getText("lname.required"));
//	}
	
	public String execute(){
		System.out.println("In Employee Execute method");
		return SUCCESS;
	}
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap=sessionMap;
		 
		for (Map.Entry<String, Object> entry : sessionMap.entrySet()) {
	        String key = entry.getKey().toString();
	        Object value = entry.getValue();
	        System.out.println("key, " + key + " value " + value );
	    }
		
	}
	
	

}
