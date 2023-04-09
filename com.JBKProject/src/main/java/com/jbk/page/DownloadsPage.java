package com.jbk.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.DownloadsObjRepo;

public class DownloadsPage extends DownloadsObjRepo {
	
	WebDriver driver;

	public DownloadsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	public String heading_Downloads() {
		return heading_Downloads.getText();
	}
	
	public String heading_DownloadsList() {
		return heading_DownloadsList.getText();
	}
	
	public String print_Row1() {
		return row1.getText();
	}
	
	public String small_Head() {
		return smallHead.getText();
	}
	
	public String print_Row2() {
		return row2.getText();
	}
	
	
	public String print_Row3() {
		return row3.getText();
	}
	
	public String print_Row4() {
		return row4.getText();
	}
	
	public String print_Row5() {
		return row5.getText();
	}
	
	public String print_Row6() {
		return row6.getText();
	}
	
	public String print_Row7() {
		return row7.getText();
	}
	
	public String print_Row8() {
		return row8.getText();
	}
	
	public void clickAllOfficialWebsites() {
//		jdkOfficialWebsite.click();
		for (WebElement webElement : clickAllOfficialWebsites) {
			webElement.click();
		}
	}
	
	public void navigateToLogoutPage() {
		logout.click();
		
	}
	
	
	

}
