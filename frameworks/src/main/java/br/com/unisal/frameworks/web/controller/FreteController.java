package br.com.unisal.frameworks.web.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.unisal.frameworks.domain.model.Frete;

@Controller
@RequestMapping(value="/frete")
public class FreteController {

	
	@RequestMapping(method=RequestMethod.GET)
	public String getIndex(Model model){
		
		model.addAttribute("frete", new Frete());
		
		return "frete/frete";
	}
	
	@RequestMapping(value="/calcular", method=RequestMethod.POST)
	public String save(@ModelAttribute(value="frete") Frete frete){
		
		frete.setDistanciaAproximada(Double.valueOf((Math.random() * 3) * 100).intValue());
		frete.setValor(new BigDecimal((Math.random() * 2) * 100));
		
		
		return "frete/resultado";
	}
}
