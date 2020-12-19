package com.educian.Testcases;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import com.educian.base.Testbase;
import com.educian.pages.Login;
import com.educian.pages.StudentList;

public class ValidateLoginTestcase extends Testbase{
  
	Login login;
	StudentList studentlistlink;
	public ValidateLoginTestcase() throws MalformedURLException {
		super();
		 
	}

	 @BeforeMethod
	 public void setup() throws Exception {
		 		 
		 initialization();
		 login=new Login();
	 }
	 
	 @Test
	 public void login() throws MalformedURLException
	 {
		 
		studentlistlink= login.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
	 }
	 @AfterMethod
	 
	 public void teardown()
	 {
		 driver.quit();
	 }
}
