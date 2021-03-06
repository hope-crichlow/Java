
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

	
	<meta charset="UTF-8">
	
	<title>Edit Language</title>
</head>

<body>
	<div class="container">
		<h1>Edit Language</h1>
		
			<div class="d-flex align-items-end justify-content-end flex-column">
				<div>
					<a href="/languages/delete/${langObj.id}">Delete</a>
				</div>
				
				<div>
					<a href="/">Dashboard</a>
				</div>
				
				
			</div>
			
			
		
		<div class="m-5 p-5">
		
			
			<form:form action="/languages/${langObj.id}/edit" method="POST" modelAttribute="langObj">
				<input type="hidden" name="_method" value="put">
				
				<div class="d-flex mt-3 justify-content-between">
			
					<form:label path="name">
						<p class="w-30">Name </p>
					</form:label>
					
					<form:errors path="name" class="text-danger"/>
					<form:input class="w-50" path="name"/>
					
				</div>
				
				<div class="d-flex mt-3 justify-content-between">
			
					<form:label path="creator">
						<p class="w-30">Creator</p>
					</form:label>
					
					<form:errors path="creator" class="text-danger"/>
					<form:input class="w-50" path="creator"/>
				</div>
				
				<div class="d-flex mt-3 justify-content-between">
			
					<form:label path="version">
						<p class="w-30">Version</p>
					</form:label>
					
					<form:errors path="version" class="text-danger"/>
					<form:input class="w-50" path="version"/>
				</div>
				
				<div class="d-flex align-items-end flex-column mt-3">
					<button class="btn btn-primary px-5" type="submit">Submit</button>
				</div>
			</form:form>
		</div>
	
		
	</div>
</body>
</html>