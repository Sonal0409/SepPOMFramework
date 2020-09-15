package com.qa.testcasesBeginners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;
import com.qa.Pagesbeginner.BeginnerSearchPage;

public class BeginnerSearchPageTest extends Base {
	
	
	// With help of TestNG annotations we are going to execute the methods
	// methods are in Page class, so we will call the methods written in page class 
	// execute them with help of testNG annotation
	
	// call the constructor from parent class, so as to access the property file
	
	// classname objectname= new classname();
	
	
	BeginnerSearchPage	sp;
	
	
	public BeginnerSearchPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();  // start your browser and start the url
		// creating an object for my page class
		sp= new BeginnerSearchPage();
	}
	
	@Test(priority='1')
	
	public void TestValidatePageTitle()
	{
		sp.validatePageTitle();
	}
	
	@Test(priority='2')
	public void testsearchBox()
	{
		sp.searchbox();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
