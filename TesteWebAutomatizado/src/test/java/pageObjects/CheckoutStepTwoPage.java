package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepTwoPage {
	
	@FindBy(name = "cancel")
	private WebElement botaoCancel;
	
	public void acionarCancel() {
		botaoCancel.click();
	}
	

}
