package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CheckoutStepOnePage;
import pageObjects.CheckoutStepTwoPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
public class CancelarCompraSteps {
	

@Dado("que acrescentei um macacao no carrinho e realizei o checkout do carrinho")
public void que_acrescentei_um_macacao_no_carrinho_e_realizei_o_checkout_do_carrinho() {
   Na(TelaInicialPage.class).adicionarMacacaoNoCarrinho();
}

@Dado("preencher os campos FirstName, LastName e ZIP Code respectivamente de {string} {string} {string}")
public void preencher_os_campos_FirstName_LastName_e_ZIP_Code_respectivamente_de(String firstname, String lastname, String postalcode) {
    Na(CheckoutStepOnePage.class).realizarCheckout(firstname, lastname, postalcode);
}

@Quando("eu clicar no botao cancel")
public void eu_clicar_no_botao_cancel() {
    Na(CheckoutStepTwoPage.class).acionarCancel();
}

@Entao("o sistema retorna para a pagina inical")
public void o_sistema_retorna_para_a_pagina_inical() {
	assertEquals("PRODUCTS", driver.findElement(By.className("title")).getText());
}

}
