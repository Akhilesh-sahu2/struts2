package com.psl;

import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

public class AddressConverter extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map map, String[] values, Class clas) {
		System.out.println("Inside convertFromString");
		System.out.println("values[0] "+values[0]);
		System.out.println("clas "+clas.getName());
		String city =null;
		String zip = null;
		StringTokenizer stk = new StringTokenizer(values[0],",");
		while(stk.hasMoreTokens()){
			city = stk.nextToken();
			zip = stk.nextToken();
		}
		return new Address(city,zip);
	}

	@Override
	public String convertToString(Map map, Object obj) {
		System.out.println("Inside convertToString");
		return obj.toString();
	}

}
