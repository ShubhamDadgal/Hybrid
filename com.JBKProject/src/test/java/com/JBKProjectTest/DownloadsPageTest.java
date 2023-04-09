package com.JBKProjectTest;

import org.testng.Assert;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.DashboardPage;
import com.jbk.page.DownloadsPage;
import com.jbk.page.LogInPage;
import com.jbk.page.OperatorPage;
import com.jbk.page.UsefulLinksPage;
import com.jbk.page.UserPage;

public class DownloadsPageTest extends TestBase{
	
	LogInPage lp=null;
	DashboardPage dp;
	UserPage up;
	OperatorPage op;
	UsefulLinksPage ul;
	DownloadsPage dw;

	@BeforeSuite
	public void beforeMethod() {
		initialization();
		lp=new LogInPage(driver);
		dp=lp.navigateToDashboardPage();
		up=dp.navigateToUserPage();
		op=up.navigateToOperatorPage();
		ul=op.navigateToUsefulLinksPage();
		dw=ul.navigateToDownloadsPage();
		

	}

	@AfterSuite
	public void afterMethod() {
		driver.quit();
		
	}
	
	
	

	@Test(priority = 1)
	public void verify_Heading_Downloads()  {
		String d1=dw.heading_Downloads();
		log.info(d1);
		Assert.assertEquals(d1, "Downloads");
		
	}
	
	@Test(priority = 2)
	public void verify_Heading_DownloadsList()  {
		String d2=dw.heading_DownloadsList();
		log.info(d2);
		Assert.assertEquals(d2, "Downloads List");
		
	}
	
	@Test(priority = 3)
	public void verify_PrintRow1()  {
		String r1=dw.print_Row1();
		log.info(r1);
	}
	
	@Test(priority = 4)
	public void verify_SmallHead()  {
		String s1=dw.small_Head();
		log.info(s1);
	}
	
	@Test(priority = 5)
	public void verify_PrintRow2()  {
		String r2=dw.print_Row2();
		log.info(r2);
	}
	
	@Test(priority = 6)
	public void verify_PrintRow3()  {
		String r3=dw.print_Row3();
		log.info(r3);
	}
	
	@Test(priority = 7)
	public void verify_PrintRow4()  {
		String r4=dw.print_Row4();
		log.info(r4);
	}
	
	@Test(priority = 8)
	public void verify_PrintRow5()  {
		String r5=dw.print_Row5();
		log.info(r5);
	}
	
	@Test(priority = 9)
	public void verify_PrintRow6()  {
		String r6=dw.print_Row6();
		log.info(r6);
	}
	
	@Test(priority = 10)
	public void verify_PrintRow7()  {
		String r7=dw.print_Row7();
		log.info(r7);
	}
	
	@Test(priority = 11)
	public void verify_PrintRow8()  {
		String r8=dw.print_Row8();
		log.info(r8);
	}
	
	
	@Test(priority = 12)
	public void verify_ClickAllOfficialWebsites()  {
		dw.clickAllOfficialWebsites();
	}
	
	
	@Test(priority = 13)
	public void verify_ClickLogout()  {
		dw.navigateToLogoutPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	
	
	
	

}
