package br.com.unisal.frameworks.web.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.unisal.frameworks.domain.model.Cidade;
import br.com.unisal.frameworks.domain.repository.CidadeRepository;

@Controller
@RequestMapping(value="/cidades")
public class CidadeController {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	private static final int PAGE_SIZE = 15;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getIndex(Model model, @RequestParam(value="page", defaultValue="1") Integer page){
		
		Page<Cidade> cidades = cidadeRepository.findAll(new PageRequest((page -1), PAGE_SIZE, new Sort(Sort.Direction.DESC, "nome")));
		
		model.addAttribute("cidades", cidades.getContent());
		model.addAttribute("cidade", new Cidade());
		
		return "cidade/cidade";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String editCidade(Model model, @PathParam(value="id") Long id){
		
		Cidade cidade = cidadeRepository.findOne(id);
		model.addAttribute("cidade", cidade);
		
		return "cidade/cidade";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteCidade(Model model, @PathParam(value="id") Long id){
		
		cidadeRepository.delete(id);
		
		return "redirect:/cidades";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute(value="cidade") Cidade cidade){
		
		cidadeRepository.save(cidade);
		
		return "redirect:/cidades";
	}
	
	

}
