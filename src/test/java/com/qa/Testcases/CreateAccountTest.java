package com.qa.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.CreateAccountPage;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;

public class CreateAccountTest extends Base {
	
	SearchPage sp;
	WikiPage wp;
	CreateAccountPage ca;
	
	public CreateAccountTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		sp= new SearchPage();
		wp=new WikiPage();
		wp =sp.searchbox(prop.getProperty("searchitem"));
		ca=wp.clickOncreateAccount();
	}
	
	@Test
	public void TestNewAccountCreate()
	{
		
		try {
			ca.createAccountNew(prop.getProperty("uname"), prop.getProperty("passwrd"),
					 prop.getProperty("retype"),prop.getProperty("email"));
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
