
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Bootstrap CDN -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	
	<!-- For any Bootstrap that uses JS or jQuery-->
	<!-- <script src="/webjars/jquery/jquery.min.js"></script> -->
	<!-- <script src="/webjars/bootstrap/js/bootstrap.min.js"></script> -->
	
	<meta charset="UTF-8">
	
	<title>Insert title here</title>
</head>

<body>
	<div class="container">
		<h1>${langObj.name} Language</h1>
	
		<div class="m-5">
	
			<div class="d-flex align-items-end flex-column">
				<a href="/languages">Dashboard</a>
			</div>
	
			<p class="mt-3">${langObj.name}</p>
			<p class="mt-3">${langObj.creator}</p>
			<p class="mt-3">${langObj.version}</p>
			<a href="/languages/edit/${langObj.id}" class="mt-3">Edit</a>
			<a href="languages/delete/${langObj.id}" class="mt-3">Delete</a>
			
		</div>
	</div>
	
</body>
</html>