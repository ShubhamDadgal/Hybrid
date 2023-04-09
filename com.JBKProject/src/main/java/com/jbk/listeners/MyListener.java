package com.jbk.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.jbk.base.TestBase;
import com.jbk.utils.DriverUtils;

public class MyListener extends TestBase implements ITestListener{

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case passed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case Failed");
		try {
			String path=DriverUtils.getScreenshot(result.getName());
			test.addScreenCaptureFromBase64String(path);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Case Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		reportInit();
		
	}

	public void onFinish(ITestContext context) {
		report.flush();//to save the extent report
		
	}
	
	

}
