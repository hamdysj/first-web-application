<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learning JSP </title>
</head>
<body>

<!-- We can use Scriplet(<%%>) to write ava code on a jsp page BUT it is not a good practice -->
<font size=10, color="red"> ${errorMessage}</font>
<form action="/spring-mvc/login" method="post">
Username: <input type="text" name="name" />
Password: <input type="password" name="password" />
<input type = "submit" value="Login" />
</form>

</body>
</html>