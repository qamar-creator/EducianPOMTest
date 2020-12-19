package com.educian.pages;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.educian.base.Testbase;
 
public class StudentList extends Testbase{

	 
 

	
	//page factories
	
	
			@FindBy(xpath="//span[@id='studentnav']")
			
	        WebElement student;//student panel name
			 
		

	// initializing the page objects

			public StudentList() throws MalformedURLException {
			super();
			 PageFactory.initElements(driver,this);

	}
			
			//Defining Actions
			
			
			public  StudentList clickstudent() throws MalformedURLException
			{
				student.click();
				return new StudentList(); 
			}
	
	
}
