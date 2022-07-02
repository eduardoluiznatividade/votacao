package br.com.infnet.votacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.infnet.votacao.model.domain.Eleitor;
import br.com.infnet.votacao.model.service.EleitorService;

@Component
public class EleitorLoader implements ApplicationRunner {

	@Autowired
	private EleitorService eleitorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Eleitor eleitor = new Eleitor();
		eleitor.setCodigo("123456");
		eleitor.setEmail("eleitor@eleitor.com");
		eleitor.setNome("Sr Eleitor");
		eleitor.setTelefone("21996016255");
		eleitor.setToken("999");
		
		try {
			eleitorService.incluir(eleitor);
			System.out.println("Gravação do eleitor realizada com sucesso!!!");			
		} catch (Exception e) {
			System.out.println("Gravação do eleitor não realizada!!!");		}
	}
}