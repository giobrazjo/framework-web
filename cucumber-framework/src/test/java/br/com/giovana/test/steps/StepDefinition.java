package br.com.giovana.test.steps;

import java.io.IOException;

import br.com.giovana.test.core.Report;
import br.com.giovana.test.pages.FolhaPage;
import br.com.giovana.test.pages.GloboPage;
import br.com.giovana.test.pages.GloboesportePage;
import br.com.giovana.test.pages.HomePage;
import br.com.giovana.test.pages.LoginPage;
import br.com.giovana.test.pages.UolPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	private LoginPage loginPage = new LoginPage();
	private HomePage homePage = new HomePage();
	private UolPage uolPage = new UolPage();
	private GloboPage globoPage = new GloboPage();
	private GloboesportePage globoesportePage = new GloboesportePage();
	private FolhaPage folhaPage = new FolhaPage();	
	private Report report = new Report();
	private TestRule tr = new TestRule();

	
	@Given("que acesso o site do google")
	public void acessoOpen() throws IOException {
		loginPage.acessarPaginaPrincipal();
		report.writeReport("Teste google acesso write...");
	}

	@When("pesquiso pelo site {string}")
	public void pesquisoSiteLancenet(String site) {
		homePage.pesquisarSiteLancenet(site);
		report.writeReport("Teste pesquiso pelo site...");
	}

	@Then("acesso o primeiro site retornado do globo")
	public void acessoPrimeiroSiteRetornadoGlobo() {
		homePage.acessarPrimeiroSiteRetornadoGlobo();
		report.writeReport("Teste acesso o primeiro site retornado...");
	}

	@When("acesso o primeiro site retornado do UOL")
	public void acessoPrimeiroSiteRetornadoUOL() {
		homePage.acessarPrimeiroSiteRetornadoUOL();
		report.writeReport("Teste acesso o primeiro site retornado...");
	}

	@When("clico no link para o GloboEsporte")
	public void clicoLinkGloboEsporte() {
		 globoPage.clicarLinkGloboesporte();
		 report.writeReport("Teste acesso GloboEsporte...");
	}

	@When("clico no link para a Folha de São Paulo")
	public void clicoLinkFolha() {
		uolPage.clicarLinkFolha();
		report.writeReport("Teste acesso Folha de São Paulo...");
	}

	@Then("valido o menu do site Globo Esporte")
	public void validoConteudoTituloGloboEsporte() {
		globoesportePage.validarConteudoTitulo();
		report.writeReport("Valido conteúdo GloboEsporte...");
	}

	@Then("valido a existência do link Econômia")
	public void validoLinkEconomia() {
		folhaPage.validarLinkEconomia();
		report.writeReport("Valido conteúdo Folha de São Paulo...");
	}
}
