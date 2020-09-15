package com.qa.Pagesbeginner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;



public class BeginnerSearchPage extends Base {
	
	// Object repository or Page Facotry
	
	@FindBy(id="searchInput")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	// instantiate page factory or page objects
	
	public BeginnerSearchPage()
	{
		PageFactory.initElements(driver, "BeginnerSearchPage.java"); // this means pointing to current class
	}
	
	// Action Methods
	
	public void validatePageTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public void validatesearchboxAvailbility()
	{
		System.out.println(searchbox.isEnabled());
		System.out.println(searchbox.isDisplayed());
	}
	
	public void searchbox()
	{
		searchbox.sendKeys("Selenium Automation");
		button.click();
		 
	}
	
	
	
	
	

	
	
	
	
	
	

}
