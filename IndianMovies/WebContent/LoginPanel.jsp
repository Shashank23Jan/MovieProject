<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#F5CBA7">
<div align="center">
<!-- This page contains a form which take user's login ID and password -->
<form action="LoginController" method="get">
<table width="30%" height="30%" bgcolor="#5DADE2" align="center">

<tr>
<td colspan=2><center><font size=2><b>User Login</b></font></center></td>
</tr>

<tr>
<td>Username</td>
<td><input type="text" size=25 name="userid"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="Password" size=25 name="pwd"></td>
</tr>

<tr align="center">
<td colspan="1"><input type="Reset"></td><td>
<input type="submit" value="Login">
</td>
</tr>

</table>
</form>
</div>
</body>
</html>