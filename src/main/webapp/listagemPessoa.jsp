<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.keytime.cadastroPessoal.modelo.Banco" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	Lista de Pessoas cadastradas:
	
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>ID</th>
		</tr>
		<c:forEach items="${Pessoas}" var="pessoa">
			<tr>
				<td>${pessoa.nome}</td>
				<td>${pessoa.id}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>