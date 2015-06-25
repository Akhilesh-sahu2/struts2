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
<hr>
<table>
<tr><td>Id           :</td><td><s:property value="id"/></td></tr>
<tr><td>First Name   :</td><td><s:property value="fname"/></td></tr>
<tr><td>Last Name    :</td><td><s:property value="lname"/></td></tr>
<tr><td>Age          :</td><td><s:property value="age"/></td></tr>
<tr><td>Birth Date   :</td><td><s:property value="birth"/></td></tr>
<s:iterator value="cirtification" status="no">
<tr><td><s:property value = "#no.count" /> Certification:</td><td><s:property/></td></tr>
</s:iterator>
<tr><td>Address      :</td><td><s:property value="address"/></td></tr>
<tr><td>City         :</td><td><s:property value="address.city"/></td></tr>
<tr><td>Zip          :</td><td><s:property value="address.zip"/></td></tr>
<s:push value="address">
<tr><td>City         :</td><td><s:property value="city"/></td></tr>
<tr><td>Zip          :</td><td><s:property value="zip"/></td></tr>
</s:push>
<tr><td>Summary          :</td><td><s:property value="summary"/></td></tr>
</table> 
<hr>
<hr>
<s:set name="empcity" value="address.city" scope="session"></s:set>
The City is: <s:property value="#session.empcity"/>
<hr>
<s:if test="age>35"> Higher Management</s:if>
<s:elseif test="age &lt: 35"> No Management</s:elseif>
<s:else > Middle Management</s:else>
<hr>
<hr>
<s:if test="hasResume">
<h3>Please upload Resume of the employee</h3>
<s:form action="cvupload" method ="post" enctype="multipart/form-data">
<%-- cv is match with attribute in Employe.java cv File Object --%>
<s:file name="cv" label="Resume:">
</s:file>
<s:submit name="cv" lable="Upload" title="Upload"></s:submit>
</s:form>
</s:if>
<hr>
</body>
</html>