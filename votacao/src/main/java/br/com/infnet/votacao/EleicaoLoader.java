package br.com.infnet.votacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.infnet.votacao.model.domain.Eleicao;
import br.com.infnet.votacao.model.service.EleicaoService;

@Component
public class EleicaoLoader implements ApplicationRunner {

	@Autowired
	private EleicaoService eleicaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("Eleicao");

		try {
			eleicaoService.incluir(eleicao);
			System.out.println("Gravação do eleição realizada com sucesso!!!");			
		} catch (Exception e) {
			System.out.println("Gravação do eleição não realizada!!!");		}
	}
}