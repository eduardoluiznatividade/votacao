package br.com.infnet.votacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.votacao.model.domain.Candidato;
import br.com.infnet.votacao.model.service.CandidatoService;
import br.com.infnet.votacao.model.service.EleicaoService;

@Controller
public class CandidatoController {
	
	@Autowired
	private CandidatoService candidatoService;
	@Autowired
	private EleicaoService eleicaoService;

	@GetMapping(value = "/candidato")
	public String cadastro(Model model) {
		
		model.addAttribute("eleicoes", eleicaoService.obterLista());
		
		return "candidato/cadastro";
	}

	@GetMapping(value = "/candidatos")
	public String lista(Model model) {
		
		model.addAttribute("lista", candidatoService.obterLista());
		
		return "candidato/lista";
	}

	@PostMapping(value = "/candidato/incluir")
	public String incluir(Candidato candidato) {
		
		candidatoService.incluir(candidato);
		
		return "redirect:/candidatos";
	}

	@GetMapping(value = "/candidato/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		candidatoService.excluir(id);
		
		return "redirect:/candidatos";
	}
}