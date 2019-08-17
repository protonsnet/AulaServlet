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
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario u = new Usuario();
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		String nome = req.getParameter("nome");
		
		u.setLogin(login);
		u.setSenha(senha);
		u.setNome(nome);
		
		usuarios.add(u);
		
		//req.setAttribute("usuarios", usuarios);
		//resp.sendRedirect("/AulaServlet"+"/sucesso.jsp");
		RequestDispatcher view = req.getRequestDispatcher("sucesso.jsp");
	    view.forward(req, resp);
		

	}

}
