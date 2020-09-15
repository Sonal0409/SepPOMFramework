package com.qa.testcasesBeginners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;
import com.qa.Pagesbeginner.BeginnerSearchPage;
import com.qa.Pagesbeginner.BeginnerWikiPage;

public class BeginnerWikiPageTest extends Base{
	//classanme obj
      BeginnerSearchPage sp;  // declaring an object
	BeginnerWikiPage wikiPage;
	
	public BeginnerWikiPageTest()
	{
		super();
	}

	
	@BeforeMethod
	public void setup()
	{
		initialization();
	//	obj= new classname();
		sp= new BeginnerSearchPage();  // assigning class to it
	 wikiPage = new BeginnerWikiPage();
	sp.searchbox();
	}
	
	@Test(priority='1')
	public void verifywikipageTitle()
	{
	
		wikiPage.validatePageTitle();
		//Assert.assertEquals(wikiPagetitle, "selenium automation - Search results - Wikipedia");
		
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
	
	//@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
}
