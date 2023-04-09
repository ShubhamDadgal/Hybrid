package com.jbk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.ObjectRepository.UsersObjRepo;
;

public class UserPage extends UsersObjRepo{

	WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public String userTitle() {
		title.getText();
		return title.getText();
	}
	
	public String heading_Users() {
		return heading_Users.getText();
	}
	
	public String heading_UserList() {
		return heading_UserList.getText();
	}
	
	public void addUserButton_Click() {
		addUserButton_Click.click();
	}
	
	public String heading_AddUser() {
		return heading_AddUser.getText();
	}
	
	public String fillDetails() {
		return fillDetails.getText();
	}
	
	public void addUser1() {
		uName.sendKeys("kiran");
		uMob.sendKeys("9511758641");
		uEmail.sendKeys("kiran@gmail.com");
		uCourse.sendKeys("Java");
		uMale.click();
		
		Select se=new Select(uSelect);
		se.selectByIndex(1);
		
		uPass.sendKeys("123456");
		uFrndNum.sendKeys("8625369514");
		uSubmit.click();
		
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
		
	}
	
	public void sideBar_User() {
		sideBar_User.click();
		
	}
	
	public void usersPrintTableHeading() {
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=8;j++) {
				String b=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/th["+j+"]")).getText();
				System.out.print(b+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public void usersPrintTableContent() {
		for(int i=2;i<=4;i++) {
			for(int j=1;j<=8;j++) {
				String b=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(b+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public void userDelete1() {
		userDelete1.click();
		
		String d1=driver.switchTo().alert().getText();
		System.out.println(d1);
		driver.switchTo().alert().accept();
		
	}
	
	public void userDelete2() {
		userDelete2.click();
		
		String d2=driver.switchTo().alert().getText();
		System.out.println(d2);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
	}
	
	public void userDelete3() {
		userDelete3.click();
		
		String d3=driver.switchTo().alert().getText();
		System.out.println(d3);
		driver.switchTo().alert().accept();
		
	}
	
	public void userDelete4() {
		userDelete4.click();
		
		String d4=driver.switchTo().alert().getText();
		System.out.println(d4);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
	}
	
	public OperatorPage navigateToOperatorPage() {
		sideBar_OperatorClick.click();
		return new OperatorPage(driver);
	}
	
	
	

}
