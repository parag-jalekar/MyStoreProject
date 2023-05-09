/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

/**
 * @author Parag
 * UserLoged In home page
 *
 */
public class HomePageTest extends BaseClass {
	 IndexPage indexPage;
	 LoginPage loginPage;
	 HomePage homePage;
	@Test
	public void navigateToMyWishList() throws InterruptedException{
		
		homePage=login(); //login method defined in BaseClass which returns HomePage object
		homePage.goToMyWishlist();
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "My Wish List");
		
	}
	
	@Test
	public void navigateToMyAccountPage() {
		
		homePage=login();
		homePage.goToMyAccount();
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "My Account");
		
		}
	
   @Test
   public void SignOutTest() {
	   homePage=login();
	   homePage.signOut();
   }
	
	

}
