package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsObjRepo {
	
	@FindBy(xpath = "//h1")
	public WebElement heading_Downloads;
	
	@FindBy(xpath = "//h3[text()='Downloads List']")
	public WebElement heading_DownloadsList;
	
	@FindBy(xpath = "//tr[1]")
	public WebElement row1;
	
	@FindBy(xpath = "//tr[1]")
	public WebElement smallHead;
	
	@FindBy(xpath = "//tr[2]")
	public WebElement row2;
	
	@FindBy(xpath = "//tr[3]")
	public WebElement row3;
	
	@FindBy(xpath = "//tr[4]")
	public WebElement row4;
	
	@FindBy(xpath = "//tr[5]")
	public WebElement row5;
	
	@FindBy(xpath = "//tr[6]")
	public WebElement row6;
	
	@FindBy(xpath = "//tr[7]")
	public WebElement row7;
	
	@FindBy(xpath = "//tr[8]")
	public WebElement row8;
	
//	@FindBy(xpath = "//tr[2]//td[8]")
//	public WebElement jdkOfficialWebsite;
	
	@FindBy(partialLinkText = "Official")
	public List<WebElement> clickAllOfficialWebsites;
	
	@FindBy(xpath = "//ul[@class=\"sidebar-menu\"]//child::span[text()='Logout']")
	public WebElement logout;
	
	

}
