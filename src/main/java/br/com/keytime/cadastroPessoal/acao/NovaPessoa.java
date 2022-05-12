package br.com.keytime.cadastroPessoal.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.keytime.cadastroPessoal.modelo.Banco;
import br.com.keytime.cadastroPessoal.modelo.Pessoa;

public class NovaPessoa{

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pessoa pessoa = new Pessoa();
		Banco banco = new Banco();
		
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setCPF(request.getParameter("cpf"));
		pessoa.setEndereco(request.getParameter("endereco"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setTelefone(request.getParameter("celular"));
		
		banco.adiciona(pessoa);
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaPessoa.jsp");
		rd.forward(request, response);
		
	}

}
