package com.JBKProjectTest;

import org.testng.Assert;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.DashboardPage;
import com.jbk.page.LogInPage;
import com.jbk.page.OperatorPage;
import com.jbk.page.UserPage;


public class OperatorPageTest extends TestBase{

	LogInPage lp=null;
	DashboardPage dp;
	UserPage up;
	OperatorPage op;

	@BeforeSuite
	public void beforeMethod() {
		initialization();
		lp=new LogInPage(driver);
		dp=lp.navigateToDashboardPage();
		up=dp.navigateToUserPage();
		op=up.navigateToOperatorPage();

	}

	@AfterSuite
	public void afterMethod() {
		driver.close();
		
	}
	
	
	
	@Test(priority = 1)
	public void verify_Heading_Operators() {
		String Op1=op.heading_Operators();
		log.info(Op1);
		Assert.assertEquals(Op1, "Operators");
		
	}
	
	@Test(priority = 2)
	public void verify_Heading_OperatorList() {
		String Op2=op.heading_OperatorList();
		log.info(Op2);
		Assert.assertEquals(Op2, "Operator List");
		
	}
	
	@Test(priority = 3)
	public void verify_AllOperatorsHeadingPrint() {
		op.allOperatorsHeadingPrint();
		
		
		
	}
	
	@Test(priority = 4)
	public void verify_AllOperatorsPrint() {
		op.allOperatorsPrint();
		
	}
	
	@Test(priority = 5)
	public void verify_ConnectionWith_WhatsappOnly() {
		op.connectionWith_WhatsappOnly();
		
	}
	
	@Test(priority = 6)
	public void verify_ConnectionWith_Whatsapp_PhoneCall_Sms_Email() {
		op.connectionWith_Whatsapp_PhoneCall_Sms_Email();
		
	}
	
	@Test(priority = 7)
	public void verify_PersonsPresentOn_MondayToSaturday() {
		op.personsPresentOn_MondayToSaturday();
		
	}
	
	@Test(priority = 8)
	public void verify_PersonsPresentOn_MondayToSunday() {
		op.personsPresentOn_MondayToSunday();
		
	}
	
	@Test(priority = 9)
	public void verify_PersonsPresentOn_MondayToFridayAndSunday() {
		op.personsPresentOn_MondayToFridayAndSunday();
		
	}
	
	@Test(priority = 10)
	public void verify_PersonsPresentOn_SaturdaySunday()  {
		op.personsPresentOn_SaturdaySunday();
		
	}
	
	@Test(priority = 11)
	public void verify_PersonsPresent_for_UrgentTechnicalHelp()  {
		op.personsPresent_for_UrgentTechnicalHelp();
		
	}
	
	@Test(priority = 12)
	public void verify_PersonsPresent_for_TechnicalDiscussion()   {
		op.personsPresent_for_TechnicalDiscussion();
		
	}
	
	@Test(priority = 13)
	public void verify_PersonsPresent_for_Administration()   {
		op.personsPresent_for_Administration();
		
	}
	
	@Test(priority = 14)
	public void verify_PersonsPresent_for_Enquiry()   {
		op.personsPresent_For_Enquiry();
		
	}
	
	@Test(priority = 15)
	public void verify_PersonsPresent_for_TechnicalHelp()   {
		op.personsPresent_For_TechnicalHelp();
		
	}
	
	@Test(priority = 16)
	public void verify_NavigateToUsefulLinksPage()   {
		op.navigateToUsefulLinksPage();
		log.info("#####----Navigating to the UsefulLinks Page#####----");
		
	}

}
