<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio mais forEach</title>
</head>
<body>
	<ul>
		<c:forEach var="i" begin="1" end="10" step="2">
			
			<li>${i}</li>
		
		</c:forEach>
	</ul>
	
</body>
</html>