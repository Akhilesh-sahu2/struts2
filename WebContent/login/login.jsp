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
<s:form action="/login/login.do" method="post">
<s:textfield name="userName" label="UserName"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:radio name ="request_locale" list="localess" value="locale"></s:radio>
<s:submit name="Submit"></s:submit>
</s:form>
</body>
</html>