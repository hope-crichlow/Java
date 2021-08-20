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
	
	<title>Registration</title>
</head>

<body>
	<div class="container">
		
		<h1>Hello, Sunshine</h1>
		<div class="d-flex justify-content-between mx-5 gap-5">
		
			<div class="w-50 border p-3">
				
<%-- 				<p><form:errors path="userObj.*" class="text-danger"/></p> --%>
			    
			    <form:form method="POST" action="/registration" modelAttribute="userObj">
			    
				    <p>
				
						<form:label path="firstName">First Name:</form:label>
						<form:errors path="firstName" class="text-danger"/>
						
						<form:input class="form-control" path="firstName"/>
						
					</p>
					<p>
						<form:label path="lastName">Last Name:</form:label>
						<form:errors path="lastName" class="text-danger"/>
						
						<form:input class="form-control" path="lastName"/>
						
					
			        <p>
			            <form:label path="email">Email:</form:label>
			            <form:errors path="email" class="text-danger"/>
			            
			            <form:input class="form-control" type="email" path="email"/>
			        </p>
			        <p>
			            <form:label path="password">Password:</form:label>
			            <form:errors path="password" class="text-danger"/>
			            
			            <form:password class="form-control" path="password"/>
			        </p>
			        <p>
			            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
			            <form:errors path="passwordConfirmation" class="text-danger"/>
			            
			            <form:password class="form-control" path="passwordConfirmation"/>
			        </p>
			        <input type="submit" class="btn btn-primary" value="Register"/>
			    </form:form>
			</div>
		</div>
	</div>
</body>
</html>