<%@taglib uri= "http://www.springframework.org/tags/form" prefix="form"%>

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
<div class="container">
	<h1>Add a Todo:</h1> <br>
	<form:form method="post" commandName = "updateTodo">
		<fieldset class="form-group">
			<form:label path="desc"> Description </form:label> 
			<form:input path="desc" type="text"  class="form-control" required="required"/>
			<form:errors path="desc" cssClass="text-warning" />
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="targetDate"> Target Date </form:label> 
			<form:input path="targetDate" type="text"  class="form-control" required="required"/>
			<form:errors path="targetDate" cssClass="text-warning" />
		</fieldset>
 
		<input type = "submit" value="Submit" />
	</form:form>
</div>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>