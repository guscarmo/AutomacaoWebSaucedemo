package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
		
	@FindBy(xpath = "/html/body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='cart_contents_container']/div/div[@class='cart_list']/div[@class='cart_item']/div[@class='cart_quantity']")
	public WebElement quantidadeItemCarrinho;
	
	
}
