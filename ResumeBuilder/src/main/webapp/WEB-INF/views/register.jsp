<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>Enter your Details ........</h1>
	<div align="center">
		<form:form action="register.htm" method="post" modelAttribute="registrationModel">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Registration</h2></td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><form:input type="text" path="loginModel.username" id="username"/></td> 
				</tr>
				<tr>
					<td>Password:</td>
 					 <td><form:input type="password" path="loginModel.password" id="pwd" /></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><form:input path="email" type="text"  id="email" /></td>
				</tr>
				<tr>
					<td>Mobile No:</td>
					<td><form:input type="text"  path="mobileNo" id="phone"/></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><form:input type="text" path="city" id="city" /></td>
					<!-- <td><select name="city">
					<option>IT-Profession</option>
					<option>Other</option>
					</select></td> -->
				</tr>
				<tr>
					<!-- <td colspan="2" align="center"><button value="Register">Submit</button></td> -->
					<td colspan="2" align="center"><input type="submit" value="Register"/></td>
				</tr>
			</table>
		</form:form>
	</div>
	<!-- <script type="text/javascript">
	$(document).ready(function(){
		alert('hi..');
	
		var jsonData=[];
		var username=$('#username').val();
		var pwd=$('#pwd').val();
		var email=$('#email').val();
		var phone=$('#phone').val();
		var city=$('#city').val();
		jsoData.push(username);
		jsoData.push(pwd);
		jsoData.push(email);
		jsoData.push(phone);
		jsoData.push(city);
		alert('hi..');
	    $("button").click(function(){
	    	type: 'POST',
	        url: 'sign-up.htm',
	        data: JSON.stringify(jsonData),
	        dataType: 'json',
	        contentType: 'application/json;charset=utf-8',
	        success:fuction(reponse){
	        	alert('success');
	        }
	    	
	    });
	});
	
	</script> -->
</body>
</html>