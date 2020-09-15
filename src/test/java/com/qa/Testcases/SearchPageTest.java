package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;

public class SearchPageTest extends Base {
	
	
	// With help of TestNG annotations we are going to execute the methods
	// methods are in Page class, so we will call the methods written in page class 
	// execute them with help of testNG annotation
	
	// call the constructor from parent class, so as to access the property file
	
	// classname objectname= new classname();
	
	SearchPage sp;
	WikiPage wp;
	
	
	public SearchPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		// creating an object for my page class
		sp= new SearchPage();
	}
	
	@Test(priority='1')
	
	public void TestValidatePageTitle()
	{
		String title=sp.validatePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Wikipedia");
	}
	
	@Test(priority='2')
	public void testsearchBox()
	{
		// WikiPage wp;  // already declared this at class level
		// new WikiPage();
	wp=sp.searchbox(prop.getProperty("searchitem"));
	// wp= new WikiPage();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
