package com.educian.pages;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import com.educian.base.Testbase;

public class Login extends Testbase {

	 
		 

	//page factories
		
		
		@FindBy(css="#inputEmail")
        WebElement username;
		
		@FindBy(css="#inputPassword")
		WebElement pass;
		
		@FindBy(xpath="//button[contains(text(),'Sign in')]")
		WebElement button;
	

// initializing the page objects

		public Login() throws MalformedURLException {
		super();
		 PageFactory.initElements(driver,this);

}
		
		//Defining Actions
		
		
		public StudentList validatelogin(String un,String pw) throws MalformedURLException
		{
			username.sendKeys(un);
			pass.sendKeys(pw);
			button.click();
			return new StudentList();
		}

} 
		 
	 


