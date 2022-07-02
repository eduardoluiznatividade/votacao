package br.com.infnet.votacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.infnet.votacao.model.domain.Candidato;
import br.com.infnet.votacao.model.service.CandidatoService;

@Component
public class CandidatoLoader implements ApplicationRunner {

	@Autowired
	private CandidatoService candidatoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Candidato candidato = new Candidato();
		candidato.setNome("Candidato");
		candidato.setNumero(13);

		try {
			candidatoService.incluir(candidato);
			System.out.println("Gravação do candidato realizada com sucesso!!!");			
		} catch (Exception e) {
			System.out.println("Gravação do candidato não realizada!!!");		}
	}
}