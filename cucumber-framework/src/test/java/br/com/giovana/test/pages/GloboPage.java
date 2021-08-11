package br.com.giovana.test.pages;

import br.com.giovana.test.core.BasePage;

public class GloboPage extends BasePage {
	
	private String XPATH_LINK_GLOBOESPORTE = "//div[3]//div[1]//a[contains(text(),' ge ')]";

	
	public GloboPage() {
		
	}
	
	public void clicarLinkGloboesporte() {
		clicar(XPATH_LINK_GLOBOESPORTE);
	}
	
 
}
