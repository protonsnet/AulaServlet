package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp)
	throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		if(login.equals("itamir") && senha.equals("itamir")) {
			Usuario u = new Usuario();
			u.setNome("itamir");
			req.getSession().setAttribute("usuario", u);
			resp.sendRedirect("/AulaServlet/paginas"+"/conteudo.jsp");
		} else	
			resp.sendRedirect("/AulaServlet"+"/login.jsp");
	}
}
