package br.com.infnet.votacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.infnet.votacao.model.domain.Voto;
import br.com.infnet.votacao.model.service.VotoService;

@Component
public class VotoLoader implements ApplicationRunner {

	@Autowired
	private VotoService votoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Voto voto = new Voto();
		voto.setLocalizacao("Localização do Voto");
		
		try {
			votoService.incluir(voto);
			System.out.println("Gravação do voto realizada com sucesso!!!");			
		} catch (Exception e) {
			System.out.println("Gravação do voto não realizada!!!");		}
	}
}