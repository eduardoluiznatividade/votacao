package br.com.infnet.votacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.votacao.model.domain.Eleicao;
import br.com.infnet.votacao.model.service.EleicaoService;

@Controller
public class EleicaoController {
	
	@Autowired
	private EleicaoService eleicaoService;

	@GetMapping(value = "/eleicao")
	public String cadastro() {
		return "eleicao/cadastro";
	}

	@GetMapping(value = "/eleicoes")
	public String lista(Model model) {
		
		model.addAttribute("lista", eleicaoService.obterLista());
		
		return "eleicao/lista";
	}

	@PostMapping(value = "/eleicao/incluir")
	public String incluir(Eleicao eleicao) {
		
		eleicaoService.incluir(eleicao);
		
		return "redirect:/eleicoes";
	}

	@GetMapping(value = "/eleicao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		eleicaoService.excluir(id);
		
		return "redirect:/eleicoes";
	}
}