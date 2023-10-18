package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.LogoutPage;
import com.e2etests.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	
	private LogoutPage logoutPage;

	public LogoutStepDefinition() {
		this.logoutPage = new LogoutPage();
	}

	@Given("Je rentre dans l application Swag Labs")
	public void jeRentreDansLApplicationSwagLabs() throws InterruptedException {
		logoutPage.loginToSauceLabs();

	}

	@When("Je clique sur le menu berger")
	public void jeCliqueSurLeMenuBerger() {
		logoutPage.clicOnButtonBurger();
	}

	@When("Je clique sur le boton logout")
	public void jeCliqueSurLeBotonLogout() {
		logoutPage.clicOnButtonLogout();
	}

	@Then("Je me redirige vers la page connexion {string}")
	public void jeMeRedirigeVersLaPageConnexion(String url) {
		String actualURL = Setup.driver.getCurrentUrl();
		Assert.assertEquals(actualURL, url);
	}
}
