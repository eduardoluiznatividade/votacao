package br.com.infnet.votacao.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.votacao.model.domain.Eleitor;

@Repository
public interface EleitorRepository extends CrudRepository<Eleitor, Integer> {

}