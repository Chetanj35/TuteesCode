<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:include page="Header.jsp"></jsp:include>

<form action="login" method="post">
		<table align="center">
			<tr>
				<td>UserID</td>	
				<td><input type="text" name="id"></td>
			</tr>
			
			<tr>
				<td>Password</td>	
				<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<td></td>	
				<td>Admin<input type="radio" name=user value="Admin">
				Faculty<input type="radio" name=user value="Faculty">
				Student<input type="radio" name=user value="Student"></td>
			</tr>
			
			<tr>
				<td></td>	
				<td><input type="submit" value="Login"></td>
			</tr>
		
		</table>

</form>

</body>
</html>