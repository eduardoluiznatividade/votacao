package br.com.infnet.votacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VotacaoController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
}