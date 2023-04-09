package com.jbk.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.UsefulLinksObjRepo;

public class UsefulLinksPage extends UsefulLinksObjRepo {
	
	WebDriver driver;

	public UsefulLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String heading_UsefulLinks() {
		return heading_UsefulLinks.getText();
	}
	
	public String heading_InternetRequired() {
		return heading_InternetRequired.getText();
	}
	
	public String heading_LinksTable() {
		return heading_LinksTable.getText();
	}
	
	public String linksTableRow1() {
		return linksTableRow1.getText();
	}
	
	public String linksTableRow2() {
		return linksTableRow2.getText();
	}
	
	public String linksTableRow3() {
		return linksTableRow3.getText();
	}
	
	public String linksTableRow4() {
		return linksTableRow4.getText();
	}
	
	public String linksTableRow5() {
		return linksTableRow5.getText();
	}
	
	public String linksTableRow6() {
		return linksTableRow6.getText();
	}
	
	public void clickLinks() {
		 for (WebElement webElement : clickLinks) {
			 webElement.click();
			
		}
	}
	
	public String footer1() {
		return footer1.getText();
	}
	public String footer2() {
		return footer2.getText();
	}
	
	public DownloadsPage navigateToDownloadsPage() {
		downloadsClick.click();
		return new DownloadsPage(driver);
	}

}
