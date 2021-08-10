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
	<div class="container gy-5">
		<div class="row p-3 ">
			<h4><u>Submitted Info</u></h4>
		</div>
		<div class="border row p-3 ">

			<div class="row mb">
				<label class="col-sm-5 col-form-label" for="name">Name:</label>
				
				<div class="col-md">
					<p>${name}</p>
				</div>
				
			</div>
			
			<div class="row mb">
				<label class="col-sm-5 col-form-label" for="name">Dojo Location:</label>
				
				<div class="col-md">
					<p>${city}</p>
				</div>
				
			</div>
			
			<div class="row mb">
				<label class="col-sm-5 col-form-label" for="name">Favorite Language:</label>
				
				<div class="col-md">
					<p>${language}</p>
				</div>
				
			</div>
			
			<div class="row mb">
				<label class="col-sm-5 col-form-label" for="name">Comment:</label>
				
				<div class="col-md">
					<p>${comment}</p>
				</div>
				
			</div>
			
			
		</div>
		<a href="/" class="btn">Home</a>
	</div>
</body>
</html>