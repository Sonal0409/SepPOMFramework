package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class WikiLoginPage extends Base{
	
	
	@FindBy(xpath="//*[@id=\"wpName1\"]")
	WebElement wikiuname;
	@FindBy(id="wpPassword1")
	WebElement wikipassword;
	@FindBy(id="wpRemember")
	WebElement rembcheckbox;
	@FindBy(id="wpLoginAttempt")
	WebElement loginbutton;
	
	public WikiLoginPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	}

	
	public SpecialPage loginintoApp()
	{
		//wikiuname.clear();
		wikiuname.sendKeys("Sonalmittal04");
		wikipassword.sendKeys("Son0409");
		rembcheckbox.click();
		loginbutton.click();
		return new SpecialPage();
	}
	
	
	
	
	
}
