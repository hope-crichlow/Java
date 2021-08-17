
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
	
	<title>Languages Dashboard</title>
</head>

<body>
	<div class="container">
		<h1>Dashboard</h1>
		
		<div class="m-5">
		
			<table class="table table-striped">
			  
			  <thead>
			    <tr>
			      <th scope="col">Name</th>
			      <th scope="col">Creator</th>
			      <th scope="col">Version</th>
			      <th scope="col">Action</th>
			    </tr>
			  </thead>
			  
			  <tbody>
				<c:forEach items="${langs}" var="eachLang"  varStatus="loop">
				   <tr>
				   		<td><a href="/languages/${eachLang.id}">${eachLang.name}</a></td>
				   		<td>${eachLang.creator}</td>
				   		<td>${eachLang.version}</td>
				   		<td>
							<a href="/languages/delete/${eachLang.id}">delete</a>	| 
							<a href="/languages/edit/${eachLang.id}">edit</a>	   		
				   		</td>
				   </tr>
		  		</c:forEach>
			  </tbody>
			  
			</table>
			
		</div>
		
		<div class="m-5 p-5">
			<form:form action="/languages/new" method="POST" modelAttribute="langObj">
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