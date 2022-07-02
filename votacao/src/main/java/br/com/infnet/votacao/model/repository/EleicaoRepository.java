package br.com.infnet.votacao.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.votacao.model.domain.Eleicao;

@Repository
public interface EleicaoRepository extends CrudRepository<Eleicao, Integer> {

}