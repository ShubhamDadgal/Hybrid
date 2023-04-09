package com.JBKProjectTest;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.jbk.base.TestBase;

import com.jbk.page.LogInPage;


public class LoginPageTest extends TestBase {
	
	
	LogInPage lp;



	
	@BeforeSuite
	public void beforeMethod() {
		initialization();
		lp=new LogInPage(driver);
		
	}
	
	@AfterSuite
	public void afterMethod() {
		driver.close();
		
	}
	
	@Test(priority = 1)
	public void downloadImg() throws Exception {
		lp.imgDownload();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	
	
	@Test(priority = 2)
	public void verify_Head1_JavaByKiran_Print() {
		Assert.assertTrue(lp.head1_JavaByKiran_Print());
	}
	
	@Test(priority = 3)
	public void verify_Head2_CoursesName_Print() {
		Assert.assertTrue(lp.head2_CoursesName_Print());
	}
	
	@Test(priority = 4)
	public void verify_Head3_SigninMessage_Print() {
		Assert.assertTrue(lp.head3_SigninMessage_Print());
	}
	
	@Test(priority = 5)
	public void verify_RegisterLink_Click() {
		lp.registerLink_Click();
	}
	
	@Test(priority = 6)
	public void verify_NewHead_JavaByKiran_Print() {
		Assert.assertTrue(lp.newHead_JavaByKiran_Print());
	}
	
	@Test(priority = 7)
	public void verify_Register_NewMember() {
		Assert.assertTrue(lp.register_NewMember());
	}
	
	@Test(priority = 8)
	public void verify_providedDataOfNewMember() throws Exception {
		lp.provideDataOfNewMember();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	
	
	@Test(priority = 9)
	public void verify_CorrectCredentials() {
		lp.navigateToDashboardPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		log.info("#####----Navigating to the Dashboard Page#####----");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

	
	
	
	
	
	
	
	


}
