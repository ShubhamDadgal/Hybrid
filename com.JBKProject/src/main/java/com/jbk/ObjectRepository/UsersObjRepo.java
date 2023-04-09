package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersObjRepo {
	

	
	
	@FindBy(xpath = "//title")
	public WebElement title;
	
	@FindBy(xpath = "//h1")
	public WebElement heading_Users;
	
	@FindBy(xpath = "//h3")
	public WebElement heading_UserList;
	
	@FindBy(xpath = "//button[text()='Add User']")
	public WebElement addUserButton_Click;
	
	@FindBy(xpath = "//h1[text()='Add User']")
	public WebElement heading_AddUser;
	
	@FindBy(xpath = "//h3[text()='Fill Below Details']")
	public WebElement fillDetails;
	
	
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement uName;
	
	@FindBy(xpath = "//input[@placeholder='Mobile']")
	public WebElement uMob;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement uEmail;
	
	@FindBy(xpath = "//input[@id='course']")
	public WebElement uCourse;
	
	@FindBy(xpath = "//input[@id='Male']")
	public WebElement uMale;
	
	@FindBy(xpath = "//select")
	public WebElement uSelect;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement uPass;
	
	@FindBy(xpath = "//input[@placeholder='FriendMobile']")
	public WebElement uFrndNum;
	
	@FindBy(xpath = "//button")
	public WebElement uSubmit;
	
	@FindBy(xpath = "//span[text()='Users']")
	public WebElement sideBar_User;
	
	@FindBy(xpath = "//tr[2]//child::td[8]//child::span")
	public WebElement userDelete1;
	
	@FindBy(xpath = "//tr[3]//child::td[8]//child::span")
	public WebElement userDelete2;
	
	@FindBy(xpath = "//tr[4]//child::td[8]//child::span")
	public WebElement userDelete3;
	
	@FindBy(xpath = "//tr[5]//child::td[8]//child::span")
	public WebElement userDelete4;
	
	
	
	@FindBy(xpath = "//span[text()='Operators']")
	public WebElement sideBar_OperatorClick;
	

}
