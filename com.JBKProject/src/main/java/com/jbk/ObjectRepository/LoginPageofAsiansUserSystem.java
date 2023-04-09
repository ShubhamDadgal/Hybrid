package com.jbk.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageofAsiansUserSystem {

	@FindBy(xpath = "//div[@id=\"kc-header-wrapper\"]")
	public WebElement heading_AsiansUserSystem;

	@FindBy(xpath = "//h1[@id=\"kc-page-title\"]")
	public WebElement headingRegister;

	@FindBy(id = "kc-locale-dropdown")
	public WebElement languageDropdown;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "password-confirm")
	public WebElement confirmPassword;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement registerButton;

	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://console.uat.asians.group/#/domain/list");
		driver.manage().window().maximize();

	}



	public boolean checkHeading_AsiansUserSystem() throws Exception {
		String actHeading = heading_AsiansUserSystem.getText();
		String expHeading = "ASIANS USER SYSTEM";
		if (actHeading.equalsIgnoreCase(expHeading)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkHeading_Register() throws Exception {
		String actHeading = headingRegister.getText();
		String expHeading = "Register";
		if (actHeading.equalsIgnoreCase(expHeading)) {
			return true;
		} else {
			return false;
		}
	}

	public void provideCredentials() {
		email.sendKeys("shubham.dadgal76@gmail.com");
		password.sendKeys("shubh789");
		confirmPassword.sendKeys("shubh789");
		registerButton.click();
	}

}
