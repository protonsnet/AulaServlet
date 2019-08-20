<%@ page import="br.ufrn.imd.aulaservlet.dominio.*"%>
<%@ page import="br.ufrn.imd.aulaservlet.servlets.*"%>
<%@ page import="java.util.List" %>
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
	  <h1>Lista de Usuários</h1>
		<table class="table" >
			<thead class="thead-dark">
			  <tr>
			     <th scope="col">Nome</td>
			     <th scope="col">Usuario</td>
			  </tr>
			</thead>
			<tbody>
				<% List<Usuario> lista = (List<Usuario>) request.getAttribute("lista");
					for (Usuario usuario: lista) {
				%>
				  <tr>
				     <td><%= usuario.getNome() %></td>
				     <td><%= usuario.getLogin() %></td>
				  </tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	<form>
		<input type="button" value="Voltar" onClick="history.go(-1)"> 
	</form>
</body>
</html>