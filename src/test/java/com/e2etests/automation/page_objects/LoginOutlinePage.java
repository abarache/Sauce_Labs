package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginOutlinePage {

	private ConfigFileReader configFileReader;

	/* @FindBy */

	@FindBy(how = How.ID, using = "user-name")
	public static WebElement Username;
	@FindBy(how = How.ID, using = "password")
	public static WebElement Password;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement LogBtn;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement TitleProducts;
	@FindBy(how = How.XPATH, using = "//h3[@data-test='error']")
	public static WebElement MessageError;

	/* Create Method */

	public LoginOutlinePage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	public void loginOutline() {
		Setup.driver.get(configFileReader.getProperties("home.url"));

	}

	public void fillUsename(String textname) {
		Username.clear();
		Username.sendKeys(textname);
	}

	public void fillPassword(String textpassword) {
		Password.clear();
		Password.sendKeys(textpassword);
	}

	public void cliqueBouton() {
		LogBtn.clear();
		LogBtn.click();
	}

}
