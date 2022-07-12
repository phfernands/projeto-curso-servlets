<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Strandard Taglib</title>
</head>
<body>

		Usuario logado: ${usuarioLogado.login }
		<c:import url="logout-parcial.jsp"></c:import>
		<c:if test="${not empty nome}">
			Empresa ${ nome } cadastrada com sucesso!
		</c:if>

Listas de empresas: <br>

<ul>
	<c:forEach items="${empresas}" var="empresa">
		
		<li>
			${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
			<a href="/gerenciador/unicaEntrada?acao=MostraEmpresa&id=${empresa.id }">editar</a>
			<a href="/gerenciador/unicaEntrada?acao=RemovaEmpresa&id=${empresa.id }">remove</a>
		</li>
	</c:forEach>

</ul>
</body>
</html>