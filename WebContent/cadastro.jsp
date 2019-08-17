<%@ page import="br.ufrn.imd.aulaservlet.dominio.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Cadastro de Usuarios</title>
</head>
<body>
	<div class = "panel panel-info">
		<div class="panel-body">
			<form action="cadastrar" method="post">
				<h1>Tela de Cadastro de Usuário</h1>
				<fieldset>
					<div class="form-group">
						<p> <input type="text" class="form-control" name="nome" placeholder="Nome..."/></p>
						<p> <input type="text" name="login" placeholder="Usuario..."/></p>
						<p> <input type="password" name="senha" placeholder="Senha..."/></p>
					</div>
					<p><input type="submit" class="btn btn-default" id="bcadastrar" value="Cadastrar">
					   <input type="reset" class="btn btn-default" id="blimpar" value="Limpar"></p>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>