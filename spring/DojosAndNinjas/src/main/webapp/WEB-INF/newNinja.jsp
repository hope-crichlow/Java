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
	
	<title>New Ninja</title>
</head>

<body>
	<div class="container">
		<h1>New Ninja</h1>
	
		<div class="container  d-flex justify-content-center mx-auto gy-5">
			
			<form:form action="/process" method="post" class="p-3 border" modelAttribute="ninjaObj">
			
			<!-- Dojo Location -->
				<div class="row mb-3">
					<form:label class="col-sm-5 col-form-label" path="dojo">Dojo: </form:label>
					
					<div class="col-md">
						<form:select class="form-control" path="dojo" id="dojo">
						
							<c:forEach var="dojo" items="${listOfDojos}">
								<form:option value="${eachDojo}">
									<c:out value="${dojo.name} Location"/>
								</form:option>
							</c:forEach>
							
						</form:select>
					</div>
				</div>
				
			<!-- First Name -->
				<div class="row mb-4">
					
					<form:label class="col-sm-5 col-form-label" path="firstName">First Name: </form:label>
					
					<div class="col-md">
						<form:input class="form-control" type="text" path="firstName" />
					</div>
				</div>
				
			<!-- Last Name -->
				<div class="row mb-4">
					
					<form:label class="col-sm-5 col-form-label" path="lastName">Last Name: </form:label>
					
					<div class="col-md">
						<form:input class="form-control" type="text" path="lastName" />
					</div>
				</div>
				
			<!-- Age -->
				<div class="row mb-4">
					
					<form:label class="col-sm-5 col-form-label" path="age">Age: </form:label>
					
					<div class="col-md">
						<form:input class="form-control" type="text" path="age" />
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