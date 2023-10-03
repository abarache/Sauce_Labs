package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPage {

	private ConfigFileReader configFileReader;

	/* @FindBy */

	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement logBtn;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement titleProducts;
	@FindBy(how = How.XPATH, using = "//h3[@data-test='error']")
	public static WebElement messageError;

	public LoginPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Method */
	public void loginP() {

		Setup.driver.get(configFileReader.getProperties("home.url"));
		username.clear();
		username.sendKeys(configFileReader.getProperties("home.username"));
		password.clear();
		password.sendKeys(configFileReader.getProperties("home.password"));
		logBtn.click();

	}

	public void loginNP() {

		Setup.driver.get(configFileReader.getProperties("home.url"));
		username.clear();
		username.sendKeys(configFileReader.getProperties("home.username.nonCorrect"));
		password.clear();
		password.sendKeys(configFileReader.getProperties("home.password.nonCorrect"));
		logBtn.click();

	}

}
