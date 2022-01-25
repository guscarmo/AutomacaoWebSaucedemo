package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class FiltroSteps {
	
	@Dado("que eu estou logado na tela inicial")
	public void que_eu_estou_logado_na_tela_inicial() {
		assertTrue(driver.findElement(By.id("react-burger-menu-btn")).isDisplayed());
	}

	@Quando("eu acionar o filtro low to high")
	public void eu_acionar_o_filtro_low_to_high() {
		Na(TelaInicialPage.class).acionarFiltroLoToHi();
	}

	@Entao("o sistema exibe os produtos do menor preco para o maior")
	public void o_sistema_exibe_os_produtos_do_menor_preco_para_o_maior() {
	    assertEquals("$7.99", driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText());
	}


}
