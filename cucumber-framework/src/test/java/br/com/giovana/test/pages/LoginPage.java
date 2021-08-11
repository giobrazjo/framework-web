package br.com.giovana.test.pages;

import br.com.giovana.test.core.BasePage;

public class LoginPage extends BasePage {
	
	private String URL_LOGIN = "";
	private String CAMPO_USUARIO = "";          
	private String CAMPO_SENHA =  "";                           
	private String BOTAO_ENTRAR = "";
	private String URL_GOOGLE = "https://www.google.com/";
	
	public LoginPage() {
		
	}

	public void acessarPaginaLogin() {
		visitarPagina(URL_LOGIN);
	}
	
	public void acessarPaginaPrincipal() {
		visitarPagina(URL_GOOGLE);
	}
	
	private void setUsuario(String usuario) {
		inserirCampo(CAMPO_USUARIO, usuario);
	}
	
	private void setSenha(String senha) {
		inserirCampo(CAMPO_SENHA, senha);
	}
	
	public void efetuarLogin(String usuario, String senha) {
		if (!estaEmLogin()) {
			visitarPagina(URL_LOGIN);
		}
		setUsuario(usuario);
		setSenha(senha);
		clicarBotao(BOTAO_ENTRAR);
	}
	
	public boolean estaEmLogin() {
		return getEndereco().equals(URL_LOGIN);
	}

}
