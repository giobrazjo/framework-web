package br.com.giovana.test.pages;

import br.com.giovana.test.core.BasePage;

public class UolPage extends BasePage {
	
	private String XPATH_LINK_FOLHA = "//a//span[contains(text(),'Folha')]";

	
	public UolPage() {
		
	}
	
	public void clicarLinkFolha() {
		clicar(XPATH_LINK_FOLHA);
	}
	
 
}
