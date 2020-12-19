package com.educian.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.educian.base.Testbase;

public class Createstudent extends Testbase {
	
	boolean f;
	//page factories
	@FindBy(xpath="//span[@id='studentnav']")
	
    WebElement student;//student panel name
	 
	@FindBy(xpath="//a[@id='studentStudentList']")// studentList xpath
	WebElement studentlist;//student panel name object
	
	@FindBy(css="div.ibox-content:nth-child(1) > a")//add student css
	WebElement addstudent;// add student object
	
	@FindBy(xpath="//input[@id='first_name']")//First Name
	WebElement FirstName;
	@FindBy(xpath="//input[@id='last_Name']")//Last Name
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='dob']")//DOB
	WebElement DOB;
	
	@FindBy(xpath="//select[@id='student_category']")//DOB
	WebElement studentcategory;
	
	@FindBy(css="#classname")//student classname
	WebElement classname;
	
	@FindBy(css="#emailId")//student email
	WebElement email;
	

	@FindBy(css="#phoneNumber")//student phone
	WebElement phoneno;
	
	@FindBy(css="#addressline1")//address 1
	WebElement address1;
	
	@FindBy(css="#city")//city
	WebElement city;
	
	@FindBy(css="#state")//city
	WebElement state;
	
	@FindBy(css="#pin")//zip
	WebElement zip;
	
	@FindBy(css="#country")//country
	WebElement country;
	

	@FindBy(xpath="//button[contains(text(),'Next')]")//next button
	WebElement next;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")//submit
	WebElement submit;
	
	// initializing the page objects
	public Createstudent() throws MalformedURLException {
		super();
		 PageFactory.initElements(driver,this);
	}

	//Defining Actions
	
	public void createStudent() 
	{
	
		student.click();
		studentlist.click();
		addstudent.click();
		FirstName.sendKeys("Auto");
		LastName.sendKeys("mation");
		DOB.sendKeys("09/10/2010");
		Select drpCategory = new Select(studentcategory);
		 
		//drpCategory.selectByValue("5e43f51c9642d70918000f65");//fg
			        
		
		
		Select drpClass = new Select(classname);
		drpClass.selectByValue("5e43f5cf9642d70918000f69");//10th
		email.sendKeys("ulzaman415@gmail.com");
		phoneno.sendKeys("67909977888");
		address1.sendKeys("Rangereth, land one pro");
		city.sendKeys("Srinagar");
		state.sendKeys("Jammu and Kashmir");
		zip.sendKeys("190001");
		Select drpCountry = new Select(country);
		drpCountry.selectByValue("United States");//usa
		next.click();
		submit.click();
		try
		{
		  f=driver.findElement(By.xpath("//span[@id='examinationTypeHelper']")).isDisplayed();
		
	 	
		}
		catch(Exception e)
		{
			
		}

	finally {
		Assert.assertTrue(f);
	}
		
	}	

}

