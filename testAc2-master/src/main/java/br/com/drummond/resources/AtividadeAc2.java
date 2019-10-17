package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeAc2 {
	
	@RequestMapping(value = "/soma /{valor1}/{valor2}", method = RequestMethod.GET)
	public String somar(@PathVariable String valor1, @PathVariable String valor2) {
		
		String par = "par";
		String impar ="impar";
		String resultado;
		Integer resposta;
	
		 resultado = (valor1 % 2 == 0);  
		 
		 if (resposta == 0)
		
	    return par;		
	    
		 else
			 
			 return impar;
	
	}
}