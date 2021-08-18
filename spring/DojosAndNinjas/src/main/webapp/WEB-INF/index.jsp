<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
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
	
	<title>New Dojo</title>
</head>

<body>
	<div class="container">
		<h1>New Dojo</h1>
		
		<div class="d-flex align-items-end justify-content-end flex-column">
				
			<div>
				<a href="/ninjas/new">New Ninja</a>
			</div>
				
		</div>
	
		<div class="m-5 p-5">
			<form:form action="/dojo/new" method="POST" modelAttribute="dojoObj">
				
				<div class="d-flex mt-3 justify-content-between">
			
					<form:label path="name">
						<p class="w-30">Name </p>
					</form:label>
					
					<form:errors path="name" class="text-danger"/>
					<form:input class="w-50" path="name"/>
					
				</div>
				
				
				<div class="d-flex align-items-end flex-column mt-3">
					<button class="btn btn-primary px-5" type="submit">Create</button>
				</div>
				
			</form:form>
		</div>
		
		<div class="m-5">
		
			<table class="table table-striped">
			  
				<thead>
					<tr>
						<th scope="col">Location</th>
						<th scope="col">Action</th>
						
					</tr>
				</thead>
			  
				<tbody>
				<c:forEach items="${listOfDojos}" var="eachDojo"  varStatus="loop">
					<tr>
						<td>${eachDojo.name}</td>
						<td>
						<a href="/dojos/${eachDojo.id}">See Students</a>
						</td>
						
					</tr>
				</c:forEach>
				</tbody>
			  
			</table>
			
		</div>
	</div>
</body>
</html>