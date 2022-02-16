<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learning JSP </title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>

<!-- We can use Scriplet(<%%>) to write ava code on a jsp page BUT it is not a good practice -->
Hi ${name} <br/>
<div class="container">
<table class="table table-striped">
<caption> Your Todos are </caption>
	<thead>
	<tr>
	<th>ID</th>
	<th>Description</th>
	<th>User</th>
	<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${todos}" var="todo">
	<tr>
	<td>${todo.id}</td>
	<td>${todo.desc}</td>
	<td>${todo.user}</td>
	<td><a href="/delete-todo?id=${todo.id}" class = "btn btn-danger"> Delete </a></td>
	</tr>
</c:forEach>
</tbody>
</table>

<div>
<a class="btn btn-success" href="/add-todo"> Add Todo </a>
</div>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>