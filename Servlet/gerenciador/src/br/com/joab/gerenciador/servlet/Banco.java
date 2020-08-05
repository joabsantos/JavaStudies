package br.com.joab.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;
public class Banco {

	private static List<Empresa> lista = new ArrayList<>();	
	
	
	static {
		
		    Empresa empresa = new Empresa();
		    empresa.setNome("Ter1");		    
		    Empresa empresa2 = new Empresa();
		    empresa2.setNome("Ter2");
		    
		    lista.add(empresa);		
		    lista.add(empresa2);		
		    
	}
	
	
	public void adicionar(Empresa empresa) {	  
		lista.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
