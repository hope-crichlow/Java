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
	
	<title>Edit ${course.name}</title>
</head>

<body>
	<div class="container">
		<h1>Edit ${courseObj.name}</h1>
	
		<div class="container  d-flex justify-content-center mx-auto gy-5">
			
			<form:form action="/courses/${courseObj.id}/edit" method="post" class="p-3 border" modelAttribute="courseObj">
			<input type="hidden" name="_method" value="put">
		
				
			<!-- Name -->
				<div class="row mb-4">
					
					<form:label class="col-sm-5 col-form-label" path="name">Name: </form:label>
					<form:errors path="name" class="text-danger"/>
					<div class="col-md">
						<form:input class="form-control" type="text" path="name" />
					</div>
				</div>
				
			<!-- Instructor -->
				<div class="row mb-4">
					
					<form:label class="col-sm-5 col-form-label" path="instructor">Instructor: </form:label>
					<form:errors path="instructor" class="text-danger"/>
					<div class="col-md">
						<form:input class="form-control" type="text" path="instructor" />
					</div>
				</div>
				
			<!-- Capacity -->
				<div class="row mb-4">
					
					<form:label class="col-sm-5 col-form-label" path="capacity">Capacity: </form:label>
					<form:errors path="capacity" class="text-danger"/>
					<div class="col-md">
						<form:input class="form-control" type="text" path="capacity" />
					</div>
				</div>		
				
				
				<div class="d-flex align-items-end flex-column mt-3">
					<button class="btn btn-primary px-5" type="submit">Create</button>
				</div>
				
			</form:form>
		</div>
		
	
	</div>
</body>
</html>