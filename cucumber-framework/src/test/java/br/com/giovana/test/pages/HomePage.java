package br.com.giovana.test.pages;

import br.com.giovana.test.core.BasePage;

public class HomePage extends BasePage {
	
	private String URL_INICIO = "";
	private String SAIR = "";
	private String XPATH_CAMPO_PESQUISA = "//input[@class='gLFyf gsfi']";
	private String XPATH_PRIMEIRO_ITEM_RETORNADO_GLOBO = "//a//div[1]//cite[contains(text(),'https://www.globo.com')]";
	private String XPATH_PRIMEIRO_ITEM_RETORNADO_UOL = "//a//div[1]//cite[contains(text(),'https://www.uol.com.br')]";
	
	public HomePage() {
		
	}
	
	public void acessaTelaInicial() {
		visitarPagina(URL_INICIO);
	}
	
	public void pesquisarSiteLancenet(String site) {
		digitar(XPATH_CAMPO_PESQUISA, site);
	}
	
	public void acessarPrimeiroSiteRetornadoGlobo() {
		esperarAteExistente(XPATH_PRIMEIRO_ITEM_RETORNADO_GLOBO, 5000)
				.clicar(XPATH_PRIMEIRO_ITEM_RETORNADO_GLOBO);
	}
	
	public void acessarPrimeiroSiteRetornadoUOL() {
		esperarAteExistente(XPATH_PRIMEIRO_ITEM_RETORNADO_UOL, 5000)
				.clicar(XPATH_PRIMEIRO_ITEM_RETORNADO_UOL);
	}
 
}
