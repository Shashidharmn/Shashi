package com.shashi.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.shashi.reports.UserReport;

public class GenricFunctions {
	
	static UserReport report=new UserReport();
	static ExtentTest test=report.UserReports();;
	public GenricFunctions() {
		
		
	}
	
	public static void setData(WebElement element,String data)
	{
		element.sendKeys(data);
		
		test.log(Status.INFO, "Setting "+ data+" to "+element.getLocation()+"   "+element.getRect()+" "+element.getCssValue("font"));
		
		
	}
	
	public static void reportFlush()
		{System.out.println("shi"+report);
		report.reportFlush();
		
	}

}
