package com.psl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class PasswordIntegrityValidator extends FieldValidatorSupport {

	static Pattern digitPattern = Pattern.compile( "[0-9]" );
	static Pattern letterPattern = Pattern.compile( "[a-zA-Z]" );
	static Pattern specialCharsDefaultPattern = Pattern.compile( "!@#$%" );
	
	private String specialChars;
	
	
	public String getSpecialChars() {
		return specialChars;
	}


	public void setSpecialChars(String specialChars) {
		this.specialChars = specialChars;
	}


	//@Override
	public void validate(Object obj) throws ValidationException {
		
		System.out.println("inside validate() method of PasswordIntegrityValidator");
		String fieldName = getFieldName();
		System.out.println("fieldName: " + fieldName);
		String fieldValue = (String)getFieldValue(fieldName, obj);
		System.out.println("fieldValue: " + fieldValue);
		
		fieldValue = fieldValue.trim();
		
		Matcher digitMatcher = digitPattern.matcher(fieldValue);
		Matcher letterMatcher = letterPattern.matcher(fieldValue);
		Matcher specialCharMatcher;
		if( getSpecialChars() != null)
		{
			Pattern specialCharsPattern = Pattern.compile( "[" + getSpecialChars() + "]" );
			specialCharMatcher = specialCharsPattern.matcher(fieldValue);
		}
		else
		{
			specialCharMatcher = specialCharsDefaultPattern.matcher(fieldValue);
		}
		
		if( !digitMatcher.find())
		{
			addFieldError(fieldName,obj);
		}
		else if( !letterMatcher.find() )
		{
			addFieldError(fieldName,obj);
		}
		else if( !specialCharMatcher.find() )
		{
			addFieldError(fieldName,obj);
		}
		

	}

}
