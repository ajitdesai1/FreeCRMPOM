package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	//Page factory or object repository has to be defined
			
		/*
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//div[text()='Login']")
		WebElement LoginBtn;
		
		@FindBy(xpath="//button[contains(text()='SignUp']")
		WebElement SignUpBtn;
		*/
		@FindBy(xpath="//a[text()='Log In']")
		WebElement LogInLnk;
		
		@FindBy(xpath="//a[text()='Sign Up']")
		WebElement SignUpLnk;
		
		//Initialize the page object repositories, create a constructor. Here "this" means current class objects/variables
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		//Actions
		public String validateHomePageTitle() {
			return driver.getTitle();
		}
}
		//This action is returning to LoginPage, hence return new LoginPage()
		/*public selectLoginLnk() {
			LogInLnk.click();
			return new LoginPage();
		
		public boolean validateCMRLogo() {
			return crmLogo.isDisplayed();
		}*/