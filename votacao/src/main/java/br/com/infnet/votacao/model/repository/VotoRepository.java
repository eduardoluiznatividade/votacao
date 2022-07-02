package br.com.infnet.votacao.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.votacao.model.domain.Voto;

@Repository
public interface VotoRepository extends CrudRepository<Voto, Integer> {

}