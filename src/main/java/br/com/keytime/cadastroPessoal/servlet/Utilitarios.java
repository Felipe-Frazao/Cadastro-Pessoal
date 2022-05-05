package br.com.keytime.cadastroPessoal.servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitarios {
	
	
	public Date formatarData(String data) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(data);
	}
	
}
