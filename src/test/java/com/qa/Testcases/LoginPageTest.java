package com.qa.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.CreateAccountPage;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiLoginPage;
import com.qa.Pages.WikiPage;

public class LoginPageTest extends Base {
	
	SearchPage sp;
	WikiPage wp;
	CreateAccountPage ca;
	WikiLoginPage lp;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		sp= new SearchPage();
		wp=sp.searchbox(prop.getProperty("searchitem"));
		wp= new WikiPage();
		ca=wp.clickOncreateAccount();
		ca= new CreateAccountPage();
		lp=ca.loginClick();
	}
	
	@Test
	public void testlogin()
	{
		
		//lp.loginintoApp(prop.getProperty("un1"), prop.getProperty("pwd1"));
		lp.loginintoApp();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
