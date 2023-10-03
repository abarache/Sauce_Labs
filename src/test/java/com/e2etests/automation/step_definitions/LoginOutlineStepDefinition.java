package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.LoginOutlinePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOutlineStepDefinition {
	private LoginOutlinePage loginOutlinePage;

	public void LoginOutileStepDefinition() {
		this.loginOutlinePage = new LoginOutlinePage();
	}

	@Given("Je me connecte sur l application Swag Labs")
	public void jeMeConnecteSurLApplicationSwagLabs() {
		loginOutlinePage.loginOutline();

	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String usNm) {
		loginOutlinePage.fillUsename(usNm);

	}

	@When("je saisie le pasword {string}")
	public void jeSaisieLePasword(String pWr) {
		loginOutlinePage.fillPassword(pWr);

	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginOutlinePage.cliqueBouton();

	}

	@Then("Je me redirige vers la pagehome {string}")
	public void jeMeRedirigeVersLaPageHome(String pageResult) {
		String menu = LoginOutlinePage.TitleProducts.getText();
		Assert.assertTrue(pageResult.contains(menu));

	}

}