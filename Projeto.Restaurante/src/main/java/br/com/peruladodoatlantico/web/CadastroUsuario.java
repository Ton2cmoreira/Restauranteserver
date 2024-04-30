package br.com.peruladodoatlantico.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CadastrarUsuario")
public class CadastroUsuario extends HttpServlet{
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		doGet(request,response);
	}
	
		
		public void dGet (HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException{	
			RequestDispatcher rd = request
					.getRequestDispatcher("Sucesso.html");
		
		rd.forward(request, response);
	}

}
