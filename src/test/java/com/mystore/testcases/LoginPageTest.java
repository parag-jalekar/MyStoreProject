/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

/**
 * @author user
 *
 */
public class LoginPageTest extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
	@Test
	public void loginTest() {
		indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		
		loginPage.login(prop.getProperty("username"), prop.getProperty("password")); //data from configuration/config.properties
		System.out.println(driver.getTitle());
		String pageTile=driver.getTitle();
		Assert.assertEquals(pageTile, "Home Page");
		
	}
	
	@Test
	public void verifyHomePageURL() {
		indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		
		loginPage.login(prop.getProperty("username"), prop.getProperty("password")); //data from configuration/config.properties
		System.out.println(driver.getTitle());
		String pageURL=driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://magento.softwaretestingboard.com/");
		
	}
}
