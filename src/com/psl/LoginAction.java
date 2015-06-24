package com.psl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	User user = new User();
	
	@Override
	public void validate() {
		System.out.println("Inside Validate");
		if(this.user.getUserName().length()==0){
			System.out.println("User name can not be empty");
			addFieldError("userName", getText("userName.required"));
		}
	}


	public String execute()
	{
		System.out.println("inside execute");
		if(  this.user.getUserName().equals("akhil") && this.user.getPassword().equals("1234"))
		{
			System.out.println("Succesfull login");
			return SUCCESS;
		}
			else
			{
			return ERROR;	
			}
		}


	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	

}
