package com.educian.Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.educian.base.Testbase;
import com.educian.pages.Createstudent;
import com.educian.pages.Login;
import com.educian.pages.StudentList;

public class createstudentTest extends Testbase{

	 
		Login login;
		Createstudent createstudent;
		public createstudentTest() throws MalformedURLException {
			super();
			 
		}
@BeforeMethod
		 public void setup() throws Exception {
			 		 
			 initialization();
			 login=new Login();
			  createstudent=new Createstudent();
}
		 


		 
		 @Test(priority=1)
		 public void createStudent() throws MalformedURLException  
		 {  
			 login.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
			 createstudent.createStudent();
		 } 
		 
		  
			 
@AfterMethod

public void teardown()
{
	driver.quit();
}
			 
			
	 

		 

}
