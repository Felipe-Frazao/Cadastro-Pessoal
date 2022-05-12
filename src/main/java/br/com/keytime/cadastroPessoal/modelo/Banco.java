package br.com.keytime.cadastroPessoal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Pessoa> lista = new ArrayList<>();
	private static int chaveSequencial= 1; 
	
	public void adiciona(Pessoa pessoa) {
		pessoa.setId(Banco.chaveSequencial++);
		Banco.lista.add(pessoa);	
		
	}
}
