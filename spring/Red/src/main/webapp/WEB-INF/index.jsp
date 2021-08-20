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
	
	<title>Home</title>
</head>

<body>
	<div class="container">
	
		<div class="d-flex justify-content-around">
            <h1>Hello, ${currentUser.name}</h1>
        </div>
		
	
		<div class="d-flex justify-content-around mb-3">
           
            <a href="/logout">Logout</a>
        </div>
        
        <div class="m-5">
		
			<table class="table table-striped">
			  
				<thead>
					<tr>
						<th scope="col">Courses</th>
						<th scope="col">Instructor</th>
						<th scope="col">SignUps</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
			  
				<tbody>
					<%-- <c:forEach items="${listOfCourses}" var="eachCourse"  varStatus="loop">
						<tr>
							<td>
							<a href="/courses/${eachCourse.id}">${eachCourse.name}</a> </td>
							<td>${eachCourse.instructor}</td>
							<td>${eachCourse.capacity}</td>
							<td>Add functionality</td>
						</tr>
					</c:forEach> --%>
				</tbody>
			  
			</table>
			
		</div>
	</div>
</body>
</html>