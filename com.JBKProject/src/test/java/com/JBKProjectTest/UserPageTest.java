package com.JBKProjectTest;

import org.testng.Assert;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.DashboardPage;
import com.jbk.page.LogInPage;
import com.jbk.page.UserPage;


public class UserPageTest extends TestBase {

	LogInPage lp=null;
	DashboardPage dp;
	UserPage up;

	@BeforeSuite
	public void beforeMethod() {
		initialization();
		lp=new LogInPage(driver);
		dp=lp.navigateToDashboardPage();
		up=dp.navigateToUserPage();

	}

	@AfterSuite
	public void afterMethod() {
		driver.close();
		
	}
	
	
	
	
	
	
	@Test(priority = 1)
	public void verify_Heading_Users() {
		String head1=up.heading_Users();
		log.info(head1);
		Assert.assertEquals(head1, "Users");
	}
	
	@Test(priority = 2)
	public void verify_Heading_UserList() {
		String head2=up.heading_UserList();
		log.info(head2);
		Assert.assertEquals(head2, "User List");
	}
	
	@Test(priority = 3)
	public void verify_AddUserButton_Click() {
		up.addUserButton_Click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");
	}
	
	@Test(priority = 4)
	public void verify_Heading_AddUser() {
		String add_head=up.heading_AddUser();
		log.info(add_head);
		Assert.assertEquals(add_head, "Add User");
	}
	
	@Test(priority = 5)
	public void verify_FillDetails() {
		String add_head1=up.fillDetails();
		log.info(add_head1);
		Assert.assertEquals(add_head1, "Fill Below Details");
	}
	
	@Test(priority = 6)
	public void addUser1() {
		up.addUser1();
		
	}
	
	@Test(priority = 7)
	public void verify_SideBar_UserClick() {
		up.sideBar_User();
		
	}
	
	@Test(priority = 8)
	public void verify_UsersPrintTableHeading() {
		up.usersPrintTableHeading();
		
	}
	
	@Test(priority = 9)
	public void verify_UsersPrintTableContent() {
		up.usersPrintTableContent();
		
	}
	
	@Test(priority = 10)
	public void addUsersDelete1() {
		up.userDelete1();
		
	}
	
	@Test(priority = 11)
	public void addUsersDelete2() {
		up.userDelete2();
		
	}
	
	@Test(priority = 12)
	public void addUsersDelete3() {
		up.userDelete3();
		
	}
	
	@Test(priority = 13)
	public void addUsersDelete4() {
		up.userDelete4();
		
	}
	
	@Test(priority = 14)
	public void verify_navigateToOperatorPage() {
		up.navigateToOperatorPage();
		log.info("#####----Navigating to the Operator Page#####----");
		
	}

}
