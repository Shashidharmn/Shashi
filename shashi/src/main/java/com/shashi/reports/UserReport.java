package com.shashi.reports;

import java.io.File;

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
