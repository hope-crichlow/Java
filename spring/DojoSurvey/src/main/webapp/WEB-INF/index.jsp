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
	
		<h1>Hello, <c:out value="${test}"/> !</h1>
		
		<div class="container d-flex justify-content-center mx-auto">
			
			<form action="/process" method="post">
				
				<div class="mb-3">
					<label class="form-label" for="name">Your Name</label>
					
					<input type="text" name="name" />
				</div>
				
				<div class="mb-3">
					<label for="location">Your Location</label>
					
					<select name="location" id="location">
					
						<c:forEach var="city" items="${dojosFromMyController}">
							<option value="${city}"><c:out value="${city}"/></option>
						</c:forEach>
					
						
<%-- 						<option value="local2"><c:out value="${local2}"/></option>
						<option value="local3"><c:out value="${local3}"/></option> --%>
					</select>
				</div>
				
				<div class="mb-3">
					<label for="language">Favorite Language</label>
					
					<select name="language" id="language">
						<option value="lang1"><c:out value="${lang1}"/></option>
						<option value="lang2"><c:out value="${lang2}"/></option>
						<option value="lang3"><c:out value="${lang3}"/></option>
					</select>
				</div>
				
				<div class="mb-3"></div>
				<div class="comment">
					<label for="comment">Comment (optional)</label>
					<br />
					<textarea name="comment" id="comment" cols="50" rows="5"></textarea>
				</div>
				<input type="submit" value="submit" />
			</form>
		</div>
	</div>
</body>
</html>