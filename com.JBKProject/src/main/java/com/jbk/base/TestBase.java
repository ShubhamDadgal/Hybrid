package com.jbk.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.jbk.page.LogInPage;

public class TestBase {
	
	public static WebDriver driver=null;
	FileInputStream fis=null;
	
	public static ExtentReports report=null;
	public static ExtentSparkReporter spark=null;
	public static ExtentTest test=null; 
	
	
	
	public static Logger log=Logger.getLogger(TestBase.class);
	

	public String readProperty(String key) {
		
		Properties properties=new Properties();
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.property");
			properties.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}
	
	public void launchApplication() {
		driver.get(readProperty("url"));
		log.info("Maximizing Window...");
		driver.manage().window().maximize();
		log.info("Applying Waits...");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		log.info("User launching JBK offline website...");
		
	}
	public WebDriver initialization() {
		log.info("Reading a property file for Browser name");
		if(readProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			log.info("opening browser as found in file");
			log.info("User launching chrome browser");
			launchApplication();
			return driver;
		}else {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
			log.info("opening browser as found in file");
			log.info("User launching firefox browser");
			launchApplication();
			return driver;
		}
		
	}
	
	public LogInPage navigateTo_LoginPage() {
		LogInPage lp=new LogInPage(driver);
		return lp;
	}
	
	public void reportInit() {
		report=new ExtentReports();
		String path=System.getProperty("user.dir")+"/target/ExtentReport.html";
		spark=new ExtentSparkReporter(path);
		report.attachReporter(spark);
		
	}
	
	

}
