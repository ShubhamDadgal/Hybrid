package com.jbk.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.DashboardObjRepo;

public class DashboardPage extends DashboardObjRepo{
	
	
	WebDriver driver;
	
	

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	
	
	public String getHeader_JavaByKiran() {
		return header_JavaByKiran.getText();
	}
	
	public String active_Kiran() {
		return active_Kiran.getText();
	}
	
	public String text_Online() {
		return text_Online.getText();
	}
	
	public String heading_Dashboard() {
		return heading_Dashboard.getText();
	}
	
	public String text_Selenium() {
		return text_Selenium.getText();
	}
	
	public String text_JavaJ2EE() {
		return text_JavaJ2EE.getText();
	}
	
	public String text_Python() {
		return text_Python.getText();
	}
	
	public String text_Php() {
		return text_Php.getText();
	}
	
	public String text_AutomationTesting() {
		return text_AutomationTesting.getText();
	}
	
	public String text_SoftwareDevelopment() {
		return text_SoftwareDevelopment.getText();
	}
	
	public String text_DataScience() {
		return text_DataScience.getText();
	}
	
	public String text_WebDevelopment() {
		return text_WebDevelopment.getText();
	}
	
	public void clickLinkText() {
		 List<WebElement> element=clickLinkText;
		 for (WebElement webElement : element) {
			 webElement.click();
		}
	}
	
	public void sideBar_Dashboard() {
		sideBar_DashboardClick.click();
	}
	
	public UserPage navigateToUserPage() {
		sideBar_UsersClick.click();
		UserPage up=new UserPage(driver);
		return up;
	}
	
	

}
