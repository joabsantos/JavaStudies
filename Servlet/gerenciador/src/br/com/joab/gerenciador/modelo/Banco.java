package br.com.joab.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;
public class Banco {

	private static List<Empresa> lista = new ArrayList<>();	
	private static Integer chaveSequecial = 1;
	
	
	
	static {
		
		    Empresa empresa = new Empresa();
		    empresa.setId(chaveSequecial++);
		    empresa.setNome("Ter1");		    
		    Empresa empresa2 = new Empresa();
		    empresa2.setNome("Ter2");
		    empresa2.setId(chaveSequecial++);
		    lista.add(empresa);		
		    lista.add(empresa2);		
		    
	}
	
	
	public void adicionar(Empresa empresa) {	
		empresa.setId(chaveSequecial++);
		lista.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		
		
		 for(Empresa empresa : lista) {
			 if(empresa.getId() == id)
				 {
					 lista.remove(empresa);
					 break;
				 }
		 }
	}

	public Empresa buscarEmpresaPorId(Integer id) {
        for (Empresa empresa : lista) {
			 if(empresa.getId() == id)
				 return empresa;
		}	        
        return null;
	}

}
