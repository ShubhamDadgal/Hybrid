package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorsObjRepo {
	
	@FindBy(xpath = "//h1")
	public WebElement heading_Operators;
	
	@FindBy(xpath = "//h3[text()='Operator List']")
	public WebElement heading_OperatorList;
	
	@FindBy(xpath = "//tr[2]//child::td[4]/span")
	public WebElement whatsAppOnly;
	
	@FindBy(xpath = "//tr[3]//child::td[4]/span[@class=\"label label-success\"]")
	public WebElement whatsappPhoneCallSmsEmail;
	
	@FindBy(xpath = "//tr[3]/child::td/b")
	public WebElement mondayToSaturday;
	
	@FindBy(xpath = "//tr[2]/child::td/b")
	public WebElement mondayToSunday;
	
	@FindBy(xpath = "//tr[5]/child::td/b")
	public WebElement mondayToFridayAndSunday;
	
	@FindBy(xpath = "//tr[6]/child::td/b")
	public WebElement saturday_Sunday;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	public WebElement urgentTechnicalhelp;
	
	@FindBy(xpath = "//tr[3]/td[3]")
	public WebElement technicalDiscussion;
	
	@FindBy(xpath = "//tr[4]/td[3]")
	public WebElement administration;
	
	@FindBy(xpath = "//tr[5]/td[3]")
	public WebElement enquiry;
	
	@FindBy(xpath = "//tr[6]/td[3]")
	public WebElement technicalHelp;
	
	
	@FindBy(xpath = "//ul[@class=\"sidebar-menu\"]//child::li[5]//span")
	public WebElement usefulLinks;
	
	

}
