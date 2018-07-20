package com.shashi.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.shashi.functions.GenricFunctions;
import com.shashi.functions.MainImpl;
import com.shashi.implementation.LoginPageImpl;
import com.shashi.reports.UserReport;

public class TestRunner {
	public WebDriver driver;
	
	@BeforeTest
	public void browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashi\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://Newtours.Demoaut.Com/");
		 Thread.sleep(500);
	}
	@Test
	public void runTest()
	{
		LoginPageImpl login=new LoginPageImpl();
		login.LoginPageExe(driver);
	}
	
	@AfterTest
	public void afterTest()
	{
		GenricFunctions functions=new GenricFunctions();
		functions.reportFlush();
	}

}