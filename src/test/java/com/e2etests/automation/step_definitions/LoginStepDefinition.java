package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {

	private LoginPage loginPage;

	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
	}

	@Given("Je me connecte a l application Swag Labs")
	public void jeMeConnecteALApplicationSwagLabs() {
		loginPage.loginP();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String texte) {
		String newmessage = LoginPage.titleProducts.getText();
		Assert.assertEquals(texte, newmessage);

	}

	@Given("Je me connecte a l application Swag Labs avec coordonnees non correct")
	public void jeMeConnecteALApplicationSwagLabsAvecCoordonneesNonCorrect() {
		loginPage.loginNP();
	}

	@Then("le message d erreur s affiche {string}")
	public void leMessageDErreurSAffiche(String Texte) {
		String Newmessage = LoginPage.messageError.getText();
		Assert.assertEquals(Texte, Newmessage);

	}

}
