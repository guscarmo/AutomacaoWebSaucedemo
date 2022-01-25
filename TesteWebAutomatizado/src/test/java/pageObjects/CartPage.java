package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(name = "remove-sauce-labs-onesie")
	private WebElement botaoRemoverMacacao;
	
	public void acionarRemoverMacacao() {
		botaoRemoverMacacao.click();
	}
	
	@FindBy(name = "checkout")
	private WebElement botaoCheckout;
	
	public void acionarBotaoCheckout() {
		botaoCheckout.click();		
	}

}
