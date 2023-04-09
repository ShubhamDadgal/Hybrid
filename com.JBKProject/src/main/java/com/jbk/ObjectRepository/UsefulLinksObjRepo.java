package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefulLinksObjRepo {
	
	@FindBy(xpath = "//h1")
	public WebElement heading_UsefulLinks;
	
	@FindBy(xpath = "//h3")
	public WebElement heading_InternetRequired;
	
	@FindBy(xpath = "//tr[1]")
	public WebElement heading_LinksTable;
	
	@FindBy(xpath = "//tr[2]")
	public WebElement linksTableRow1;
	
	@FindBy(xpath = "//tr[3]")
	public WebElement linksTableRow2;
	
	@FindBy(xpath = "//tr[4]")
	public WebElement linksTableRow3;
	
	@FindBy(xpath = "//tr[5]")
	public WebElement linksTableRow4;
	
	@FindBy(xpath = "//tr[6]")
	public WebElement linksTableRow5;
	
	@FindBy(xpath = "//tr[7]")
	public WebElement linksTableRow6;
	
	@FindBy(partialLinkText = "Go")
	public List<WebElement> clickLinks;
	
	@FindBy(xpath = "//footer//child::strong")
	public WebElement footer1;
	
	@FindBy(xpath = "//footer//b")
	public WebElement footer2;
	
	
	
	@FindBy(xpath = "//span[text()='Downloads']")
	public WebElement downloadsClick;
	
	

}
