package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LogoutPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement userName;
	@FindBy(how = How.ID, using = "password")
	public static WebElement passWord;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement logBtnn;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement titleProductss;
	@FindBy(how = How.XPATH, using = "//h3[@data-test='error']")
	public static WebElement messageErrorr;
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement munuBurgerBtn;
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logoutBtn;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement loggBtn;

	public LogoutPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Method */
	public void loginToSauceLabs() throws InterruptedException {

		Setup.driver.get(configFileReader.getProperties("url"));
		userName.clear();
		userName.sendKeys(configFileReader.getProperties("home.username"));
		passWord.clear();
		passWord.sendKeys(configFileReader.getProperties("home.password"));
		logBtnn.click();
		Thread.sleep(3000);
	}

	public void clicOnButtonBurger() {
		munuBurgerBtn.click();

	}

	public void clicOnButtonLogout() {

		logoutBtn.click();

	}

}
