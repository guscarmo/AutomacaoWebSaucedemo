package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import pageObjects.TelaInicialPage;

public class LoginSteps {
	
	@Dado("que eu acesso o site")
	public void que_eu_acesso_o_site() {
	    acessarSite();
	}
	
	@Quando("eu informar o usuario {string}")
	public void eu_informar_o_usuario(String username) {
		Na(LoginPage.class).informarUsername(username);
	}

	@Quando("informar a senha {string}")
	public void informar_a_senha(String password) {
		Na(LoginPage.class).informarPassword(password);
	}

	@Quando("clicar no botao login")
	public void clicar_no_botao_login() {
		Na(LoginPage.class).acionarLoginButton();
	}

	@Entao("o sistema exibe o usuario logado")
	public void o_sistema_exibe_o_usuario_logado() {
		assertTrue(driver.findElement(By.id("react-burger-menu-btn")).isDisplayed());		
	}
	

}
