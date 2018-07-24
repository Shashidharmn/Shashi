package com.shashi.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shashi.functions.GenricFunctions;
import com.shashi.functions.MainImpl;
import com.shashi.pageObjetcs.LoginPage;

public class LoginPageImpl extends MainImpl implements LoginPage {
	
	MainImpl imp=new MainImpl();
	public void LoginPageExe( WebDriver driver)
	{
		
		System.out.println(UserName);
		imp.setData(driver.findElement(By.name(UserName)), "Shashi");
		System.out.println("-------------------------"+driver.getTitle()+"--------------------");

	}

}
