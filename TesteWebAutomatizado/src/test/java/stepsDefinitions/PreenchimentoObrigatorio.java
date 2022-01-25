package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CartPage;
import pageObjects.CheckoutStepOnePage;
import pageObjects.LoginPage;
import pageObjects.TelaInicialPage;

public class PreenchimentoObrigatorio {
	@Dado("que eu estou com um macacao no carrinho")
	public void que_eu_estou_com_um_macacao_no_carrinho() {
		Na(TelaInicialPage.class).acionarBotaoAddMacacao();
		Na(TelaInicialPage.class).acionarBotaoCarrinho();
	}

	@Dado("Acionei o botao checkout")
	public void acionei_o_botao_checkout() {
	    Na(CartPage.class).acionarBotaoCheckout();
	}

	@Quando("eu acionar o botao continue")
	public void eu_acionar_o_botao_continue() {
	    Na(CheckoutStepOnePage.class).acionarBotaoContinue();
	}
	
	@Entao("o sistema me sinaliza que o campo First Name e obrigatorio")
	public void o_sistema_me_sinaliza_que_o_campo_First_Name_e_obrigatorio() {
	    assertEquals("Error: First Name is required", driver.findElement(By.xpath("/html/body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[@class='checkout_info_wrapper']/form/div[@class='checkout_info']/div[@class='error-message-container error']")).getText());
	}
	
	@Entao("apos preencher com o nome {string}")
	public void apos_preencher_com_o_usuario(String firstname) {
		Na(CheckoutStepOnePage.class).informarFirstName(firstname);
	}
	
	@Entao("o sistema me sinaliza que o campo Last Name e obrigatorio")
	public void o_sistema_me_sinaliza_que_o_campo_Last_Name_e_obrigatorio() {
		assertEquals("Error: Last Name is required", driver.findElement(By.xpath("/html/body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[@class='checkout_info_wrapper']/form/div[@class='checkout_info']/div[@class='error-message-container error']")).getText()); 
	}

	@Entao("apos preencher com o sobrenome {string}")
	public void apos_preencher_com_o_sobrenome(String lastname) {
		Na(CheckoutStepOnePage.class).informarLastName(lastname);
	}
	
	@Entao("o sistema me sinaliza que o campo Postal Code e obrigatorio")
	public void o_sistema_me_sinaliza_que_o_campo_Postal_Code_e_obrigatorio() {
		assertEquals("Error: Postal Code is required", driver.findElement(By.xpath("/html/body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[@class='checkout_info_wrapper']/form/div[@class='checkout_info']/div[@class='error-message-container error']")).getText());
	}

	@Entao("apos preencher com o postal code {string}")
	public void apos_preencher_com_o_postal_code(String postalcode) {
	    Na(CheckoutStepOnePage.class).informarPostalCode(postalcode);
	}

	@Entao("o sistema avanca para a proxima etapa")
	public void o_sistema_avanca_para_a_proxima_etapa() {
		assertEquals("CHECKOUT: OVERVIEW", driver.findElement(By.className("title")).getText());
	}



	
		

}
