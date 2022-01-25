package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	@Before(value = "not @Login")
	public void setUp() {
		acessarSite();
		Na(LoginPage.class).realizarLogin("standard_user", "secret_sauce");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
	driver.quit();
	}
}
