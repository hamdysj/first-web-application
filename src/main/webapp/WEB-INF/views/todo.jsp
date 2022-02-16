<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learning JSP </title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>

<!-- We can use Scriplet(<%%>) to write ava code on a jsp page BUT it is not a good practice -->
<font size=10, color="red"> ${errorMessage}</font>

<form action="/add-todo" method="post">
Add a Todo: <br>
<input type="text" name="desc" />
<input type = "submit" value="Add" />
</form>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>