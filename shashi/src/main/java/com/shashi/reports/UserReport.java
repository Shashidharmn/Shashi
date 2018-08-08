package com.shashi.reports;

import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class UserReport {

	
	public ExtentHtmlReporter htmlReporter ;//= new ExtentHtmlReporter(new File("C:\\Users\\Shashi\\Desktop\\Report.html"));
	public ExtentReports extent;// = new ExtentReports();
	public ExtentTest test;// = extent.createTest("ShashiReport", "Checking the Title");;

	
public ExtentTest UserReports(){
	
	 //extent
	this.htmlReporter = new ExtentHtmlReporter(new File("C:\\Users\\Shashi\\Desktop\\Report.html"));
	this.extent = new ExtentReports();
htmlReporter.loadXMLConfig(new File("C:\\Users\\Shashi\\git\\shashi\\shashi\\Config.xml"));
	
	
	this.extent.attachReporter(htmlReporter);
	this.test = extent.createTest("ShashiReport1", "Checking the Title");;
	
	 System.out.println("inside user report");
	
	return test;
}


public void reportFlush()
{
	 this.extent.flush();
}
}
