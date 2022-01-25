package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CartPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class RemoveItemDoCarrinhoSteps {
	
	@Dado("que estou com um item no carrinho")
	public void que_estou_com_um_item_no_carrinho() {
		Na(TelaInicialPage.class).acionarBotaoAddMacacao();
		Na(TelaInicialPage.class).acionarBotaoCarrinho();
		//Valida que o macacao esta no carrinho
		assertEquals("Sauce Labs Onesie", driver.findElement(By.className("inventory_item_name")).getText());
	}
		
	@Quando("eu clicar em remove")
	public void eu_clicar_em_remove() {
		Na(CartPage.class).acionarRemoverMacacao();
	}

	@Entao("o item e removido antes de ser realizado o checkout")
	public void o_item_e_removido_antes_de_ser_realizado_o_checkout() {
		// Valida se não existe nenhum item no carrinho
		assertEquals("", driver.findElement(By.className("shopping_cart_link")).getText());
		}

}
