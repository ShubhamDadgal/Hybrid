package com.JBKProjectTest;

import org.testng.Assert;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.DashboardPage;
import com.jbk.page.LogInPage;
import com.jbk.page.OperatorPage;
import com.jbk.page.UsefulLinksPage;
import com.jbk.page.UserPage;

public class UsefulLinksPageTest extends  TestBase{
	
	LogInPage lp=null;
	DashboardPage dp;
	UserPage up;
	OperatorPage op;
	UsefulLinksPage ul;

	@BeforeSuite
	public void beforeMethod() {
		initialization();
		lp=new LogInPage(driver);
		dp=lp.navigateToDashboardPage();
		up=dp.navigateToUserPage();
		op=up.navigateToOperatorPage();
		ul=op.navigateToUsefulLinksPage();

	}

	@AfterSuite
	public void afterMethod() {
		driver.quit();
		
	}
	
	

	@Test(priority = 1)
	public void verify_Heading_UsefulLinks()   {
		String h1=ul.heading_UsefulLinks();
		System.out.println(h1);
		Assert.assertEquals(h1, "Useful Links");;
		
	}
	
	@Test(priority = 2)
	public void verify_Heading_InternetRequired()   {
		String h2=ul.heading_InternetRequired();
		log.info(h2);
		Assert.assertEquals(h2, "* Internet Required");;
		
	}
	
	@Test(priority = 3)
	public void verify_Heading_LinksTable()  {
	String headingTabel=ul.heading_LinksTable();
	log.info(headingTabel);
		
	}
	
	@Test(priority = 4)
	public void verify_LinksTableRow1()  {
		String row1=ul.linksTableRow1();
		log.info(row1);
		
	}
	
	@Test(priority = 5)
	public void verify_LinksTableRow2()  {
		String row2=ul.linksTableRow2();
		log.info(row2);
		
	}
	
	
	@Test(priority = 6)
	public void verify_LinksTableRow3()  {
		String row3=ul.linksTableRow3();
		log.info(row3);
		
	}
	
	@Test(priority = 7)
	public void verify_LinksTableRow4()  {
		String row4=ul.linksTableRow4();
		log.info(row4);
		
	}
	
	@Test(priority = 8)
	public void verify_LinksTableRow5()  {
		String row5=ul.linksTableRow5();
		log.info(row5);
		
	}
	
	@Test(priority = 9)
	public void verify_LinksTableRow6()  {
		String row6=ul.linksTableRow6();
		log.info(row6);
		
	}
	
	@Test(priority = 10)
	public void verify_ClickLinks()  {
		ul.clickLinks();
		
	}
	
	@Test(priority = 11)
	public void verify_Footer1()  {
		String foot1=ul.footer1();
		log.info(foot1);
		
	}
	
	
	@Test(priority = 12)
	public void verify_Footer2()  {
		String foot2=ul.footer2();
		log.info(foot2);
		
	}
	
	
	@Test(priority = 13)
	public void verify_NavigateToDownloadsPage()  {
		ul.navigateToDownloadsPage();
		log.info("#####----Navigating to the Downloads Page#####----");
		
	}
	

}
