package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;



public class SearchPage extends Base {
	
	// Object repository or Page Facotry
	
	@FindBy(id="searchInput")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	// instantiate page factory or page objects
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	}
	
	// Action Methods
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	

	
	
	public WikiPage searchbox(String searchitem)
	{
		searchbox.sendKeys(searchitem);
		button.click();
		return new WikiPage();   // WikiPage class object
	}
	
	
	
	
	

	
	
	
	
	
	

}
