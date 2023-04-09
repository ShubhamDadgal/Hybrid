package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjRepo {
	
	@FindBy(id ="img")
	public WebElement img;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath ="//button")
	public WebElement bttn;
	
	
	@FindBy(xpath = "//b[text()='Java By Kiran']")
	public WebElement head1_JavaByKiran;
	
	@FindBy(xpath = "//h4")
	public WebElement head2_Courses;
	
	@FindBy(xpath = "//p")
	public WebElement head3_SigninMessage;
	
	@FindBy(xpath = "//a[text()=\"Register a new membership\"]")
	public WebElement registerLink;
	
	@FindBy(xpath = "//b")
	public WebElement newHead_JavaByKiran;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[text()='Register a new membership']")
	public WebElement registerNewMember;
	
	@FindBy(xpath ="//input[@name='name']" )
	public WebElement name;
	
	@FindBy(xpath ="//input[@name='mobile']")
	public WebElement mobile;
	
	@FindBy(xpath ="//input[@name='email']" )
	public WebElement email1;
	
	@FindBy(xpath ="//input[@name='password']")
	public WebElement pass1;
	
	@FindBy(xpath = "//button")
	public WebElement bttn1;
	
	@FindBy(xpath = "//a[text()='I already have a membership']")
	public WebElement regiLink;
	

}
