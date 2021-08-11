package br.com.giovana.test.pages;

import br.com.giovana.test.core.BasePage;

public class GloboesportePage extends BasePage {

	private String XPATH_MENU_GLOBOESPORTE = "//header[@id='header-produto']//div[2]//span[contains(text(),'MENU')]";


	public GloboesportePage() {

	}

	public void validarConteudoTitulo() {
		esperaAteExistente(XPATH_MENU_GLOBOESPORTE);
		validarConteudo(XPATH_MENU_GLOBOESPORTE, "MENU");
	}

}
