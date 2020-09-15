package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class WikiPage extends Base{
	
	@FindBy(linkText="Create account")
	WebElement createAccountLink;
	@FindBy(linkText="Main page")
	WebElement MainpageLink;
	@FindBy(linkText="Contact us")
	WebElement Contactus;
	
	public WikiPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	
	}
	
	// Action Method
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public CreateAccountPage clickOncreateAccount()
	{
		createAccountLink.click();
		return new CreateAccountPage();   // CreateAccountPage class object
	}
	
	public MainPage clickOnMainPage()
	{
		MainpageLink.click();
		return new MainPage();   // CreateAccountPage class object
	}
	
	public ContactUsPage clickOnContactus()
	{
		Contactus.click();
		return new ContactUsPage();   // CreateAccountPage class object
	}

}
