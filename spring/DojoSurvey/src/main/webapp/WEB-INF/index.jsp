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
	
	<!-- For any Bootstrap that uses JS or jQuery-->
	<!-- <script src="/webjars/jquery/jquery.min.js"></script> -->
	<!-- <script src="/webjars/bootstrap/js/bootstrap.min.js"></script> -->
	
	<meta charset="UTF-8">
	
	<title>Dojo Survey</title>
	
</head>

<body>
	<div class="container">
		<h1>Dojo Survey</h1> 
		
		<div class="container  d-flex justify-content-center mx-auto gy-5">
			
			<form action="/process" method="post" class="p-3 border">
				
				<div class="row mb-4">
					<label class="col-sm-5 col-form-label" for="name">Your Name</label>
					
					<div class="col-md">
						<input class="form-control" type="text" name="name" />
					</div>
				</div>
				
				<div class="row mb-3">
					<label class="col-sm-5 col-form-label" for="city">Dojo Location</label>
					
					<div class="col-md">
						<select class="form-control" name="city" id="city">
							<c:forEach var="city" items="${citiesFromMyController}">
								<option value="${city}">
									<c:out value="${city}"/>
								</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="row mb-3">
					<label class="col-sm-5 col-form-label" for="language">Favorite Language</label>
					
					<div class="col-md">
						<select class="form-control" name="language" id="language">
							<c:forEach var="language" items="${langsFromMyController}">
								<option value="${language}">
									<c:out value="${language}"/>
								</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="row mb-3">
				
					<div class="comment">
						<label class="col-sm-5 col-form-label" for="comment">Comment (optional)</label>
						<br/>
						<textarea class="form-control" name="comment" id="comment" cols="50" rows="5"></textarea>
					</div>
				</div>
				<input type="submit" value="Submit" />
				
			</form>
		</div>
	</div>
</body>
</html>