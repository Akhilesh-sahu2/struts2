<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags"  prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:i18n name="com.psl.EmployeeAction">
<h3><s:property value="getText('welcome')"/></h3>
<s:text name="welcome"/>
</s:i18n>
<s:form action="/login/employee.do" method="post">
	<s:textfield key="id"></s:textfield>
	<s:textfield key="fname" ></s:textfield>
	<s:textfield key="lname" ></s:textfield>
	<s:textfield key="age" ></s:textfield>
	<s:textfield key="birth" ></s:textfield>
	<s:textfield key="cirtification"></s:textfield>
	<s:textfield key="cirtification" ></s:textfield>
	<s:textfield key="address"></s:textfield>
	<s:textarea key= "summary" col="100" row="10" wrap="true" ></s:textarea>
	<s:checkbox key="hasResume" fieldValue="true" ></s:checkbox>
	<s:submit label="Save Employee" ></s:submit>
</s:form>
</body>
</html>