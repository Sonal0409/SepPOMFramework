package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class CreateAccountPage extends Base {
	
	@FindBy(id="wpName2")
	WebElement username;
	@FindBy(id="wpPassword2")
	WebElement password;
	@FindBy(id="wpRetype")
	WebElement rtype;
	@FindBy(id="wpEmail")
	WebElement em;
	@FindBy(id="wpCreateaccount")
	WebElement button;
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	
	}

	public AccountPage createAccountNew(String uname, String passwrd, String retype, String email) throws InterruptedException
	{
		username.sendKeys(uname);
		password.sendKeys(passwrd);
		rtype.sendKeys(retype);
		em.sendKeys(email);
		Thread.sleep(5000);
		button.click();
	return new AccountPage();	
	}
	
	public WikiLoginPage loginClick()
	{
		loginLink.click();
		return new WikiLoginPage();
	}
	
	
	
	
	
	
}
