<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Bootstrap CDN -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	
	
	
	<meta charset="UTF-8">
	
	<title>Book</title>
</head>

<body>
	<div class="container">
		<h1><c:out value="${book.title}" /></h1>
		<p>Description: <c:out value="${book.description }" /></p>
		<p>Language: <c:out value="${book.language }" /></p>
		<p>Number of Pages: <c:out value="${book.numberOfPages }" /></p>
		<br />
		<p>Created At: <c:out value="${book.createdAt }" /></p>
		<p>Updated At: <c:out value="${book.updatedAt }" /></p>
		
		<a href="/">Home</a>
	</div>
</body>
</html>