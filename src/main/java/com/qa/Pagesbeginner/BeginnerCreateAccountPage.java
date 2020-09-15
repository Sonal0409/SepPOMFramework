package com.qa.Pagesbeginner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class BeginnerCreateAccountPage extends Base {
	
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
	
	
	public BeginnerCreateAccountPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	
	}

	public void createAccountNew() throws InterruptedException
	{
		username.sendKeys("sonal123");
		password.sendKeys("son@123");
		rtype.sendKeys("son@123");
		em.sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		button.click();
		
	}
	
	public void loginClick()
	{
		loginLink.click();
		
	}
	
	
	
	
	
	
}
