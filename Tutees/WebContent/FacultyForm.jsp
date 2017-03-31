<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="msg.js">
	</script>

</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>
<form action="FacultyRegister" name="myForm" method="post" onsubmit="return msg()" >
		
		<table align="center">
			<tr>
			<td>Name</td>
			<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
			<td>E-mail</td>
			<td><input type="text" name="email"></td>
			</tr>
			
			<tr>
			<td>Password</td>
			<td><input type="password"  name="password"></td>
			</tr>
			
			<tr>
			<td>Gender</td>
			<td><input type="radio" name="gender" value="Male">Male
			<input type="radio" name="gender" value="Female">Female
			<input type="radio" name="gender" value="Other">Other
			</td>
			</tr>
			
			<tr>
			<td>Contact</td>
			<td><input type="text"   name="contact" ></td>
			</tr>
			
			<tr>
			<td>Blood Group</td>
			<td><select name="bloodGroup">
			<option value="A+">A+</option>
			<option value="A-">A-</option>
			<option value="B+">B+</option>
			<option value="B-">B-</option>
			<option value="O+">O+</option>
			<option value="O-">O-</option>
			<option value="AB+">AB+</option>
			<option value="AB-">AB-</option></select>
			</tr>
		
			<tr>
			<td>College Id</td>
			<td><input type="text"  name="collegeID"></td>
			</tr>
		
			<tr>
			<td>Subject teaching</td>
			<td><input type="text"  name="subjectTeaching"></td>
			</tr>
		
			<tr>
			<td>Coordinator</td>
			<td><input type="text"  name="coodinatorOf"></td>
			</tr>
			
			<tr>
			<td>Designation</td>
			<td><select name="designation">
			<option value="HOD">HOD</option>
			<option value="Professor">Professor</option>
			<option value="Assistance Proffessor">Assistance Professor</option>
			<option value="Associate Professor">Associate Professor</option>
			</select>
			</tr>
		
			<tr>
			<td>Qualification</td>
			<td><input type="text"  name="qualification"></td>
			</tr>
		
		
			<tr>
			<td>Classes Teaching</td>
			<td><input type="text"  name="classesTeaching"></td>
			</tr>
		
			<tr>
			<td><input type="reset"></td>
			<td><input type="submit"  value="Submit"></td>
			</tr>
		
		</table>
	</form>

</body>
</html>