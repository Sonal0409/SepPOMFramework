package com.qa.testcasesBeginners;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.CreateAccountPage;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;
import com.qa.Pagesbeginner.BeginnerCreateAccountPage;
import com.qa.Pagesbeginner.BeginnerSearchPage;
import com.qa.Pagesbeginner.BeginnerWikiPage;

public class BeginnerCreateAccountTest extends Base {
	
	BeginnerSearchPage sp;
	BeginnerWikiPage wp;
	BeginnerCreateAccountPage ca;
	
	public BeginnerCreateAccountTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		sp= new BeginnerSearchPage();
		wp=new BeginnerWikiPage();
		ca= new BeginnerCreateAccountPage();
		sp.searchbox();
		wp.clickOncreateAccount();
	}
	
	@Test
	public void TestNewAccountCreate()
	{
		
		try {
			ca.createAccountNew();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testloginLinkClick()
	{
		ca.loginClick();
	}
	

}
