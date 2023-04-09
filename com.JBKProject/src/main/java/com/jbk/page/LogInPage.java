package com.jbk.page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.jbk.ObjectRepository.LoginPageObjRepo;
import com.jbk.base.TestBase;

public class LogInPage extends LoginPageObjRepo {

	WebDriver driver;

//	---------- Constructor-----------//
	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static Logger log=Logger.getLogger(TestBase.class);

//	---------- Methods-----------//

	public void imgDownload() throws Exception{
		Actions act=new Actions(driver);
		act.contextClick(img);
		Thread.sleep(2000);
		
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_ENTER);
		
	}
	

	public boolean head1_JavaByKiran_Print() {
		String actH1 = head1_JavaByKiran.getText();
		System.out.println(actH1);
		String expH1 = "Java By Kiran";
		if (actH1.equalsIgnoreCase(expH1)) {
			log.info("Heading matched");
			return true;
		} else {
			log.info("Heading not matched");
			return false;
		}

	}

	public boolean head2_CoursesName_Print() {
		String actH2 = head2_Courses.getText();
		System.out.println(actH2);
		String expH2 = "JAVA | SELENIUM | PYTHON";
		if (actH2.equalsIgnoreCase(expH2)) {
			log.info("Heading matched");
			return true;
		} else {
			log.info("Heading not matched");
			return false;
		}

	}

	public boolean head3_SigninMessage_Print() {
		String actH3 = head3_SigninMessage.getText();
		System.out.println(actH3);
		String expH3 = "Sign in to start your session";
		if (actH3.equalsIgnoreCase(expH3)) {
			log.info("Heading matched");
			return true;
		} else {
			log.info("Heading not matched");
			return false;
		}

	}

	public void registerLink_Click() {
		registerLink.click();

	}

	public boolean newHead_JavaByKiran_Print() {
		String actH4 = newHead_JavaByKiran.getText();
		System.out.println(actH4);
		String expH4 = "Java By Kiran";
		if (actH4.equalsIgnoreCase(expH4)) {
			log.info("Heading matched");
			return true;
		} else {
			log.info("Heading not matched");
			return false;
		}

	}

	public boolean register_NewMember() {
		String actH5 = registerNewMember.getText();
		System.out.println(actH5);
		String expH5 = "Register a new membership";
		if (actH5.equalsIgnoreCase(expH5)) {
			log.info("Heading matched");
			return true;
		} else {
			log.info("Heading not matched");
			return false;
		}

	}

	public void provideDataOfNewMember() throws Exception {
		name.sendKeys("kiran");
		mobile.sendKeys("8624739651");
		email1.sendKeys("kiran@gmail.com");
		pass1.sendKeys("123456");
		bttn1.click();

		Thread.sleep(2000);
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		regiLink.click();

	}

	public DashboardPage navigateToDashboardPage() {
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		bttn.click();
		DashboardPage dp=new DashboardPage(driver);
		return dp;
	}
	
	

}
