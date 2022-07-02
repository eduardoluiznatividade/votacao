package br.com.infnet.votacao.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.votacao.model.domain.Candidato;
import br.com.infnet.votacao.model.domain.Eleicao;
import br.com.infnet.votacao.model.repository.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public List<Candidato> obterLista(){
		return (List<Candidato>) candidatoRepository.findAll();
	}

	public List<Candidato> obterLista(Eleicao eleicao){
		return (List<Candidato>) candidatoRepository.findAll(eleicao.getId());
	}

	public void incluir(Candidato candidato) {
		candidatoRepository.save(candidato);
	}
	
	public void excluir(Integer id) {
		candidatoRepository.deleteById(id);
	}
}