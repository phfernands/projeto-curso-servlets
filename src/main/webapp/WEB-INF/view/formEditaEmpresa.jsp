<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/unicaEntrada" var="linkServletAlteraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:import url="logout-parcial.jsp"></c:import>
	<form action="${linkServletAlteraEmpresa}" method="post">
	
		Nome: <input type="text" name="nome" value="${empresa.nome }">
		Data de Abertura: <input type="text" name="data" value='<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>'>
		<input type="hidden" name="id" value="${empresa.id }">
		<input type="hidden" name="acao" value="AlteraEmpresa">
		<input type="submit">
		
	</form>
</body>
</html>