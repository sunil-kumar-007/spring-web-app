<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Edit Student</title>
	</head>
	<body>
		<b>Edit Student</b>
		<form:form commandName="studCmd">
			<p style="color: red;">
		 		<form:errors path="*"/>
		 	</p>
			id:<form:input path="id"/><br/>
			name:<form:input path="name"/><br/>
			<input type="submit" value="insert"/>					
		</form:form>
	</body>
</html>