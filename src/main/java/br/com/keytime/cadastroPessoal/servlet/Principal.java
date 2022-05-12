package br.com.keytime.cadastroPessoal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.keytime.cadastroPessoal.acao.NovaPessoa;

@WebServlet("/")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url= request.getRequestURI();
		System.out.println(url);
		
		if(url.equals("/Cadastro-Pessoal/novaPessoa")) {
			NovaPessoa np = new NovaPessoa();
			np.executa(request, response);
		}else {
			System.out.println("Nada");
		}
	}
}
