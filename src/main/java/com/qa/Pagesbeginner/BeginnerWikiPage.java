package com.qa.Pagesbeginner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class BeginnerWikiPage extends Base{
	
	@FindBy(linkText="Create account")
	WebElement createAccountLink;
	@FindBy(linkText="Main page")
	WebElement MainpageLink;
	@FindBy(linkText="Contact us")
	WebElement Contactus;
	
	public BeginnerWikiPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	
	}
	
	// Action Method
	public void validatePageTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public void clickOncreateAccount()
	{
		createAccountLink.click();
		  // CreateAccountPage class object
	}
	
	public void clickOnMainPage()
	{
		MainpageLink.click();
		  // CreateAccountPage class object
	}
	
	public void clickOnContactus()
	{
		Contactus.click();
		   // CreateAccountPage class object
	}

}
