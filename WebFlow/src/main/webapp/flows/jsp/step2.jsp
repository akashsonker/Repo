<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%--  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Local Address Details</h1>
<div align="center">
		<form id="step2" action="${flowExecutionUrl}" method="POST">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
			<table border="0">
				<tr>
					<td>Street:</td>
					<td><input type="text"  id="street" /></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input type="text"  id="city" /></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input type="text" id="state" /></td>
				</tr>
				<tr>
					<td>Country:</td>
					<td><input type="text"  id="country" /></td>
				</tr>
				
				<tr>
					<!-- <td colspan="2" align="center"><input type="submit" value="Submit"/></td> -->
					
					<td><button id="cancel" type="submit" name="_eventId_cancel">Cancel</button></td>
					<td><button id="previous" type="submit" name="_eventId_previous">&lt;&lt; Previous</button></td>
					<td><button id="next" type="submit" name="_eventId_next">Next &gt;&gt;</button></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>