package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homepage;
	//constructor 
	public HomePageTest() {
		//super keyword will call super class constructor i.e. public TestBase() under TestBase.java
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		//create an object of HomePage...HomePage constructor
		homepage=new HomePage();
	}
	
	@Test
	public void HomePageTitleTest() {
		String title=homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Free CRM software can boost your sales by 30%");
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
