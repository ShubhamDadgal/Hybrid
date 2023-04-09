package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardObjRepo {
	
	
	
	
	
	
	
	@FindBy(xpath = "//b[text()=\"Java By Kiran\"]")
	public WebElement header_JavaByKiran;
	
	@FindBy(xpath = "//p[text()=\"Kiran\"]")
	public WebElement active_Kiran;
	
	@FindBy(xpath = "//a[text()=\" Online\"]")
	public WebElement text_Online;
	
	@FindBy(xpath = "//h1[contains(text(),'Dash')]")
	public WebElement heading_Dashboard;
	
	@FindBy(xpath = "//h3[text()='Selenium']")
	public WebElement text_Selenium;
	
	@FindBy(xpath = "//h3[text()='Java / J2EE']")
	public WebElement text_JavaJ2EE;
	
	@FindBy(xpath = "//h3[text()='Python']")
	public WebElement text_Python;
	
	@FindBy(xpath = "//h3[text()='Php']")
	public WebElement text_Php;
	
	@FindBy(xpath = "//p[text()='Automation Testing']")
	public WebElement text_AutomationTesting;
	
	@FindBy(xpath = "//p[text()='Software Development']")
	public WebElement text_SoftwareDevelopment;
	
	@FindBy(xpath = "//p[text()='Data Science']")
	public WebElement text_DataScience;
	
	@FindBy(xpath = "//p[text()='Web Development']")
	public WebElement text_WebDevelopment;
	
	@FindBy(partialLinkText = "More")
	public List<WebElement> clickLinkText;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	public WebElement sideBar_DashboardClick;
	
	@FindBy(xpath = "//span[text()='Users']")
	public WebElement sideBar_UsersClick;
	
	
	

}
