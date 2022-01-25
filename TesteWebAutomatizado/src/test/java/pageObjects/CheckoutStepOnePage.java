package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOnePage {
	
	@FindBy(name = "continue")
	private WebElement botaoContinue;
	
	@FindBy(name = "firstName")
	private WebElement campoFirstName;
	
	@FindBy(name = "lastName")
	private WebElement campoLastName;
	
	@FindBy(name = "postalCode")
	private WebElement campoPostalCode;
	
	public void acionarBotaoContinue() {
		botaoContinue.click();	
	}
	
	public void informarFirstName(String firstname) {
		campoFirstName.sendKeys(firstname);
	}
		
	public void informarLastName(String lastname) {
		campoLastName.sendKeys(lastname);
	}
			
	public void informarPostalCode(String postalcode) {
		campoPostalCode.sendKeys(postalcode);
		
	}
	
	public void realizarCheckout(String firstname, String lastname, String postalcode) {
		campoFirstName.sendKeys(firstname);
		campoLastName.sendKeys(lastname);
		campoPostalCode.sendKeys(postalcode);
		botaoContinue.click();
	}

}
