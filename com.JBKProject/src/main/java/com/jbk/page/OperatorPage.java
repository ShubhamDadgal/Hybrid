package com.jbk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.jbk.ObjectRepository.OperatorsObjRepo;

public class OperatorPage extends OperatorsObjRepo{
	
	WebDriver driver;

	public OperatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String heading_Operators() {
		return heading_Operators.getText();
	}
	
	public String heading_OperatorList() {
		return heading_OperatorList.getText();
	}
	
	public void allOperatorsHeadingPrint() {
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=6;j++) {
				String b1=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/th["+j+"]")).getText();
				System.out.print(b1+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public void allOperatorsPrint() {
		for(int i=2;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				String b2=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(b2+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	
	
	
	
	public void connectionWith_WhatsappOnly() {
		
		if(whatsAppOnly != null) {
			System.out.println("Persons connecting with whatsapp Only :-Kiran, Darshit");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void connectionWith_Whatsapp_PhoneCall_Sms_Email() {
		
		if(whatsappPhoneCallSmsEmail != null) {
			System.out.println("Persons connecting with whatsapp, Phone Call,sms, email :-Neelam,Seema,Varsha");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	
	public void personsPresentOn_MondayToSaturday() {
		
		if(mondayToSaturday != null) {
			System.out.println("Persons present on Monday- Saturday:- Neelam, Seema");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void personsPresentOn_MondayToSunday() {
		
		if(mondayToSunday!= null) {
			System.out.println("Person present on Monday- Sunday:- Kiran");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void personsPresentOn_MondayToFridayAndSunday() {
		
		if(mondayToFridayAndSunday != null) {
			System.out.println("Person present on Monday to Friday and Sunday:- Varsha");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void personsPresentOn_SaturdaySunday() {
		
		if(saturday_Sunday != null) {
			System.out.println("Person present on Saturday-Sunday:- Darshit");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void personsPresent_for_UrgentTechnicalHelp() {
		
		if(urgentTechnicalhelp != null) {
			System.out.println("Persons present for Urgent technical help- Kiran ");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void personsPresent_for_TechnicalDiscussion() {
		
		if(technicalDiscussion!= null) {
			System.out.println("Person present for Technical Discussion (Errors, Software, Technical Materials)- Neelam");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void personsPresent_for_Administration() {
		
		if(administration != null) {
			System.out.println("Person present for Administration (Fees, ID Card, Certificates, WhatsApp Group, Enquiry)- Seema");
		}
		else {
			System.out.println("nobody is present");
		}
		System.out.println(" ");
	}
	
	
	public void personsPresent_For_Enquiry() {
		
		if(enquiry != null) {
			System.out.println("Person present for Enquiry(Course Details, Fees, Enquiry)- Varsha");
			
		}
		else {
			System.out.println("nobody is present");
			
		}
		
		
		System.out.println(" ");
	}
	
	
	public void personsPresent_For_TechnicalHelp() {
		
		if(technicalHelp != null) {
			System.out.println("Person present for Technical Help:- Darshit");
			
		}
		else {
			System.out.println("nobody is present");
			
		}
		
		
		System.out.println(" ");
	}
	
	public UsefulLinksPage navigateToUsefulLinksPage() {
		usefulLinks.click();
		return new UsefulLinksPage(driver);
		
	}
	

}
