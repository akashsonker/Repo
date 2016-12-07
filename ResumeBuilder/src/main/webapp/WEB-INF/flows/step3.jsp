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
<h1>Give your permanent address detail....</h1>
</body>
<div align="center">
		<form:form id="step3" action="${flowExecutionUrl}" method="POST" modelAttribute="permanentAddressModel">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
			<table border="0">
				<tr>
					<td>Street:</td>
					<td><form:input type="text" path="street" id="street" /></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><form:input type="text" path="city" id="city" /></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><form:input type="text" path="state" id="state" /></td>
				</tr>
				<tr>
					<td>Country:</td>
					<td><form:input type="text" path="country" id="country" /></td>
				</tr>
				
				<tr>
					<!-- <td colspan="2" align="center"><input type="submit" value="Submit"/></td> -->
					<td><button id="cancel" type="submit" name="_eventId_cancel">Cancel</button></td>
					<td><button id="previous" type="submit" name="_eventId_previous">&lt;&lt; Previous</button></td>
					<td><button id="finish" type="submit" name="_eventId_finish">Finish &gt;&gt;</button></td>
				</tr>
			</table>

		</form:form>
	</div>
</html>