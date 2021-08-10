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
	
	<title>Dojo Survey Results</title>
</head>

<body>
	<div class="container">
		<h1>Submitted Info</h1>
		<div>
			<h2>Name: ${name}</h2>
			<h2>Dojo Location: ${city}</h2>
			<h2>Favorite Language: ${language}</h2>
			<h2>Comment: ${comment}</h2>
			
			<a href="/" class="btn">Home</a>
		</div>
	</div>
</body>
</html>