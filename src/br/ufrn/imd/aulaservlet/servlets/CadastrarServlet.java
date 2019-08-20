package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Cadastro;
import br.ufrn.imd.aulaservlet.dominio.Usuario;

/**
 * Servlet implementation class CadastrarServlet
 */
@WebServlet("/cadastrar")
public class CadastrarServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp)
	throws ServletException, IOException {
		Cadastro cadUsuario = (Cadastro) getServletContext().getAttribute("cadastro");
		
		Usuario u = new Usuario();
		
		u.setLogin(req.getParameter("login"));
		u.setSenha(req.getParameter("senha"));
		u.setNome(req.getParameter("nome"));
		
		cadUsuario.addUsuario(u);
		
		//req.setAttribute("usuarios", usuarios);
		//resp.sendRedirect("/AulaServlet"+"/sucesso.jsp");
		req.setAttribute("lista", cadUsuario.listarUsuarios());
		RequestDispatcher view = req.getRequestDispatcher("lista.jsp");
	    view.forward(req, resp);

	}

}
