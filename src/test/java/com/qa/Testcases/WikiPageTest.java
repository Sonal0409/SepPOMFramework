package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;

public class WikiPageTest extends Base{
	
	SearchPage sp;
	WikiPage wikiPage;
	
	public WikiPageTest()
	{
		super();
	}

	
	@BeforeMethod
	public void setup()
	{
		initialization();
		sp= new SearchPage();
		// WikiPage wikiPage = new WikiPage();
	wikiPage =sp.searchbox(prop.getProperty("searchitem"));
	}
	
	@Test(priority='1')
	public void verifywikipageTitle()
	{
		String wikiPagetitle=wikiPage.validatePageTitle();
		Assert.assertEquals(wikiPagetitle, "selenium automation - Search results - Wikipedia");
		
	}
	
	@Test(priority='2')
	public void TestCreateAccountLink()
	{
		wikiPage.clickOncreateAccount();
	}
	
	@Test(priority='3')
	public void TestMainPageLink()
	{
		wikiPage.clickOnMainPage();
	}
	
	@Test(priority='4')
	public void TestContactUs()
	{
		wikiPage.clickOnContactus();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
}
