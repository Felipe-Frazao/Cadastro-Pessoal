package br.com.keytime.cadastroPessoal.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaPessoa")
public class NovaPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Utilitarios uti = new Utilitarios();
		
		String nomeCAD = request.getParameter("nome");
		String  cpfCAD = request.getParameter("cpf");
		try {
			Date dataNascCAD = uti.formatarData(request.getParameter("data"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String enderecoCAD = request.getParameter("endereco");
		String emailCAD = request.getParameter("email");
		String celularCAD = request.getParameter("celular");
		
		
	}

}
