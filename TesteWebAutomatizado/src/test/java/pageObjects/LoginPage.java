package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "user-name")
	private WebElement campoUsername;
	
	@FindBy(name = "password")
	private WebElement campoPassword;
	
	@FindBy(name = "login-button")
	private WebElement loginButton;
	
	public void informarUsername(String username) {
		campoUsername.sendKeys(username);
	}
	
	public void informarPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void acionarLoginButton() {
		loginButton.click();
	}
	
	public void realizarLogin(String username, String password) {
		informarUsername(username);
		informarPassword(password);
		acionarLoginButton();
	}
	
}
