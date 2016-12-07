<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter your details</h1>
	<div align="center">
		<form:form id="step1" action="${flowExecutionUrl}" method="POST" modelAttribute="resumeModel">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
			<table border="0">
				<tr>
					<td>Resume Title:</td>
					<td><form:input type="text" path="resumeTitle" id="title" /></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><form:input type="text" path="firstName" id="fname" /></td>
				</tr>
				<tr>
					<td>Middle Name:</td>
					<td><form:input type="text" path="middleName" id="mname" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input type="text" path="lastName" id="lname" /></td>
				</tr>
				<tr>
					<td>Father Name:</td>
					<td><form:input type="text" path="fatherName" id="father_name" /></td>
				</tr>
				<tr>
					<td>Marital Status:</td>
					<td><form:input type="text" path="maritalStatus" id="mstatus" /></td>
				</tr>
				<tr>
					<td>Email ID:</td>
					<td><form:input type="text" path="emailID" id="email" /></td>
				</tr>
				<tr>
					<!-- <td colspan="2" align="center"><input type="submit" value="Submit"/></td> -->
					<td><button id="cancel" type="submit" name="_eventId_cancel">Cancel</button></td>
					<td><button id="next" type="submit" name="_eventId_next">Next &gt;&gt;</button></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>