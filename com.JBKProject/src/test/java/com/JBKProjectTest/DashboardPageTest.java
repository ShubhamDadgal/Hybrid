package com.JBKProjectTest;


import org.testng.Assert;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.DashboardPage;
import com.jbk.page.LogInPage;

public class DashboardPageTest extends TestBase {
	LogInPage lp=null;
	DashboardPage dp;
	
	
	@BeforeSuite
	public void beforeMethod() {
		initialization();
		lp=new LogInPage(driver);
		dp=lp.navigateToDashboardPage();
	
		
	}
	
	@AfterSuite
	public void afterMethod() {
		driver.quit();
		
	}
	
	
	@Test(priority = 1)
	public void verify_Header_JavaByKiran() {
		String actHead1=dp.getHeader_JavaByKiran();
		log.info("Actual Header of Dashboard Page:--"+actHead1);
		Assert.assertEquals(actHead1, "Java By Kiran");
	}
	
	@Test(priority = 2)
	public void verify_Active_Kiran() {
		String actHead2=dp.active_Kiran();
		log.info("Actual Header of Dashboard Page:--"+actHead2);
		Assert.assertEquals(actHead2, "Kiran");
	}
	
	@Test(priority = 3)
	public void verify_Text_Online() {
		String actHead3=dp.text_Online();
		log.info("Actual Header of Dashboard Page:--"+actHead3);
		Assert.assertEquals(actHead3, "Online");
	}
	
	@Test(priority = 4)
	public void verify_Heading_Dashboard() {
		String actHead4=dp.heading_Dashboard();
		log.info("Actual Header of Dashboard Page:--"+actHead4);
		Assert.assertEquals(actHead4, "Dashboard Courses Offered");
	}
	
	@Test(priority = 5)
	public void verify_Text_Selenium() {
		String actHead5=dp.text_Selenium();
		log.info("Actual Header of Dashboard Page:--"+actHead5);
		Assert.assertEquals(actHead5, "Selenium");
	}
	
	@Test(priority = 6)
	public void verify_Text_JavaJ2EE() {
		String actHead6=dp.text_JavaJ2EE();
		log.info("Actual Header of Dashboard Page:--"+actHead6);
		Assert.assertEquals(actHead6, "Java / J2EE");
	}
	
	@Test(priority = 7)
	public void verify_Text_Python() {
		String actHead7=dp.text_Python();
		log.info("Actual Header of Dashboard Page:--"+actHead7);
		Assert.assertEquals(actHead7, "Python");
	}
	
	@Test(priority = 8)
	public void verify_Text_Php() {
		String actHead8=dp.text_Php();
		log.info("Actual Header of Dashboard Page:--"+actHead8);
		Assert.assertEquals(actHead8, "Php");
	}
	
	@Test(priority = 9)
	public void verify_Text_AutomationTesting() {
		String actHead9=dp.text_AutomationTesting();
		log.info("Actual Header of Dashboard Page:--"+actHead9);
		Assert.assertEquals(actHead9, "Automation Testing");
	}
	
	@Test(priority = 10)
	public void verify_Text_SoftwareDevelopment() {
		String actHead10=dp.text_SoftwareDevelopment();
		log.info("Actual Header of Dashboard Page:--"+actHead10);
		Assert.assertEquals(actHead10, "Software Development");
	}
	
	@Test(priority = 11)
	public void verify_Text_DataScience() {
		String actHead11=dp.text_DataScience();
		log.info("Actual Header of Dashboard Page:--"+actHead11);
		Assert.assertEquals(actHead11, "Data Science");
	}
	
	@Test(priority = 12)
	public void verify_Text_WebDevelopment() {
		String actHead12=dp.text_WebDevelopment();
		log.info("Actual Header of Dashboard Page:--"+actHead12);
		Assert.assertEquals(actHead12, "Web Development");
	}
	
	@Test(priority = 13)
	public void verify_clickLinkText() {
		dp.clickLinkText();
	}
	
	@Test(priority = 14)
	public void verify_SideBar_Dashboard() {
		dp.sideBar_Dashboard();
	}
	
	@Test(priority = 15)
	public void verify_SideBar_UsersClick() {
		dp.navigateToUserPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
		log.info("#####----Navigating to the Users Page#####----");
		
		
	}
	

}
