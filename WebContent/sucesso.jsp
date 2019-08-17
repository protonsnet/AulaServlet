<%@ page import="br.ufrn.imd.aulaservlet.dominio.*"%>
<%@ page import="br.ufrn.imd.aulaservlet.servlets.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Sucesso</title>
</head>
<body>
	<div class="alert alert-success" role="alert">
	  Cadastrado com Sucesso!
	</div>
	<div>
		<h2>Usuários</h2>
		<ul>
			<c:forEach var="usuarios" items="${usuarios}">
				<li>
					<td><c:out value="${usuarios.nome }"/></td>
				</li>
			</c:forEach>
		</ul>
	</div>

</body>
</html>