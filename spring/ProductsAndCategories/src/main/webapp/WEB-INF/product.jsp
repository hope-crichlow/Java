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
	
	<title>Product</title>
	
</head>

<body>
	<div class="container">
		<h1>${product.name}</h1>
		
		<div>
			<h4>Categories:</h4>
			
			<ul>
				<c:forEach var="category" items="${categories}">
					<li><c:out value="${category.name}"/></li>
				</c:forEach>
			</ul>
		</div>
		
		<div>
			<h3>Add Category</h3>
			<form action="/products/${product_id}" method="POST">
			<select name="category_id" id="">
				<c:forEach var="category" items="${categories}">
					<option value="${category.id}">
						<c:out value="${category.name}"/>
					</option>
				</c:forEach>
			</select>
			
			<div class="d-flex align-items-end flex-column mt-3">
				<button class="btn btn-primary px-5" type="submit">Add Category</button>
			</div>
			</form>
		</div>
		
		
	
		
	</div>
</body>
</html>