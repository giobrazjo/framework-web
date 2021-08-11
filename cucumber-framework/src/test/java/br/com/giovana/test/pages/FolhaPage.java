package br.com.giovana.test.pages;

import br.com.giovana.test.core.BasePage;

public class FolhaPage extends BasePage {
	
	private String XPATH_LINK_ECONOMIA = "//div[@id='menu']//nav[2]//ul//li[4]//a[contains(text(),'economia')]";

	
	public FolhaPage() {
		
	}
	
	public void validarLinkEconomia() {
		esperarPaginaCarregar();
		validarConteudo(XPATH_LINK_ECONOMIA, "economia");
	}
	
 
}
