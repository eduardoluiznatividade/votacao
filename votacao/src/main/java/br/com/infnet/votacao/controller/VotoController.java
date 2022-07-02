package br.com.infnet.votacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.votacao.model.domain.Eleicao;
import br.com.infnet.votacao.model.domain.Voto;
import br.com.infnet.votacao.model.service.CandidatoService;
import br.com.infnet.votacao.model.service.EleicaoService;
import br.com.infnet.votacao.model.service.EleitorService;
import br.com.infnet.votacao.model.service.VotoService;

@Controller
public class VotoController {
	
	@Autowired
	private VotoService votoService;
	@Autowired
	private EleicaoService eleicaoService;
	@Autowired
	private CandidatoService candidatoService;
	@Autowired
	private EleitorService eleitorService;

	@GetMapping(value = "/voto")
	public String cadastro(Model model, @RequestParam Integer idEleicao) {
		
		Eleicao eleicao = eleicaoService.obterPorId(idEleicao);
		
		model.addAttribute("eleicao", eleicao);
		
		model.addAttribute("candidatos", candidatoService.obterLista(eleicao));
		
		model.addAttribute("eleitores", eleitorService.obterLista());
		
		return "voto/cadastro";
	}

	@GetMapping(value = "/votos")
	public String lista(Model model) {
		
		model.addAttribute("lista", votoService.obterLista());
		
		model.addAttribute("eleicoes", eleicaoService.obterLista());
		
		return "voto/lista";
	}

	@PostMapping(value = "/voto/incluir")
	public String incluir(Voto voto) {
		
		votoService.incluir(voto);
		
		return "redirect:/votos";
	}

	@GetMapping(value = "/voto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		votoService.excluir(id);
		
		return "redirect:/votos";
	}
}