package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class TelaInicialPage extends BasePage {
	 	
	//Menu Filtros
	@FindBy(xpath = "/html/body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[@class='header_secondary_container']/div[@class='right_component']/span[@class='select_container']/select[@class='product_sort_container']/option[@value='lohi']")
	private WebElement filtrarLoToHi;
	
	public void acionarFiltroLoToHi() {
		filtrarLoToHi.click();
	}
	
	//Elementos
	@FindBy(name = "add-to-cart-sauce-labs-onesie")
	private WebElement botaoAddMacacao;
		
	@FindBy(id = "shopping_cart_container")
	private WebElement botaoCarrinho;
	
		
	public void acionarBotaoAddMacacao() {
		botaoAddMacacao.click();
	}
	
	public void acionarBotaoCarrinho() {
		botaoCarrinho.click();
	}
	
	//Adiciona o Macacao no carrinho e realiza o checkout no carrinho
	public void adicionarMacacaoNoCarrinho() {
		acionarBotaoAddMacacao();
		acionarBotaoCarrinho();
		Na(CartPage.class).acionarBotaoCheckout();
	}
}

