package com.JBKProjectTest;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.ObjectRepository.LoginPageofAsiansUserSystem;

public class TestLoginPage {
	
	LoginPageofAsiansUserSystem lp;
	
	@BeforeSuite
	public void beforeMethod() {
		lp=new LoginPageofAsiansUserSystem();
		lp.initialization();
	}
	
	@Test
	public void heading_AsianUserSystem() throws Exception {
		Assert.assertTrue(lp.checkHeading_AsiansUserSystem());
	}
	

}
