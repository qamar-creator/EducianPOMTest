package com.educian.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

import com.educian.utils.utils;

import org.openqa.selenium.support.ui.Select;


public class Testbase {

   public  static Properties prop;
   public	static int attemptSS ;
	WebElement uploadElement;
     String  actualResult;
	String expectedResult;
	public static WebDriver driver  ;
	public Testbase() throws MalformedURLException
	{
		
		
		
		try
		{
			  prop = new Properties();
			  FileInputStream ip= new FileInputStream("C:\\Users\\MinzaMushtaq3\\eclipse-workspace\\EducianPOMTest\\src\\main\\java\\com\\educian\\environmentvariables\\config.properties");
			  prop.load(ip);
	}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
}
	
	public static void initialization()  
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MinzaMushtaq3\\Downloads\\chromedriver.exe");
		 driver =  new org.openqa.selenium.chrome.ChromeDriver();
		/*driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
				.withRemoteAddress(new URL("http://localhost:8585"))
				.withToken("WHZ_iC8PTUJQ8eR4Btq5tDVK-jdmdAsvvMHLXggKiwg1")	
				.build(ChromeDriver.class);*/
		
		 driver.navigate().to(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utils.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
		
	}
}