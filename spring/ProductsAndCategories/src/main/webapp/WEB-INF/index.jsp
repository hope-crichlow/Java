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
	
	<title>New Product</title>
</head>

<body>
	<div class="container">
		<h1>New Product</h1>
	
		<div class="m-5 p-5">
			<form:form action="/products/new" method="POST" modelAttribute="prodObj">
				
				<div class="d-flex mt-3 justify-content-between">
			
					<form:label path="name">
						<p class="w-30">Name: </p>
					</form:label>
					
			<%-- 		<form:errors path="name" class="text-danger"/> --%>
					<form:input class="w-50" path="name"/>
					
				</div>
				
				<div class="d-flex mt-3 justify-content-between">
			
					<form:label path="description">
						<p class="w-30">Description: </p>
					</form:label>
					
				<%-- 	<form:errors path="description" class="text-danger"/> --%>
					<form:input class="w-50" path="description"/>
					
				</div>
				
				<div class="d-flex mt-3 justify-content-between">
			
					<form:label path="price">
						<p class="w-30">Price: </p>
					</form:label>
					
				<%-- 	<form:errors path="price" class="text-danger"/> --%>
					<form:input class="w-50" type="number" stop=".1" path="price"/>
					
				</div>
				
				
				<div class="d-flex align-items-end flex-column mt-3">
					<button class="btn btn-primary px-5" type="submit">Create</button>
				</div>
				
			</form:form>
		</div>
	</div>
</body>
</html>