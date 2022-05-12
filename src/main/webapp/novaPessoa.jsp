<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaPessoa" var="pessoa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pessoa}" method="post">
		Nome Completo: <input type="text" name="nome">
		CPF: <input type="text" name="cpf">
		<!--Data de Nascimento: <input type="text" name="data">-->
		Endereço: <input type="text" name="endereco">
		E-mail: <input type="text" name="email">
		Celular: <input type="text" name="celular">
		<input type="submit">
	</form>
	
</body>
</html>