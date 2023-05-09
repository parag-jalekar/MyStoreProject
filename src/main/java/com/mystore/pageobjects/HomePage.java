/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.mystore.base.BaseClass;

/**
 * @author Paragj
 *
 */
public class HomePage extends BaseClass{
	public HomePage(){
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='action switch'][1]")
	WebElement accountToggleButton;
	
	@FindBy(xpath="//a[contains(text(), 'My Wish List')]")
	WebElement myWishList;
	
	@FindBy(xpath="//a[contains(text(), 'My Account')]")
	WebElement myAccount;
	
	@FindBy(xpath="//a[contains(text(), 'Sign Out')]")
	WebElement SignOut;
		
	@FindBy(xpath="//a[contains(@class, 'action showcart') or contains(@class, 'action showcart active')]")
	WebElement shoppingCartLogo;
	

	public MyAccountPage goToMyAccount() {
		accountToggleButton.click();
		myAccount.click();
		return new MyAccountPage(); 
	}
	
	public MyWishListPage goToMyWishlist() {
		accountToggleButton.click();
		myWishList.click();
		return new MyWishListPage();
	}
	
	public void signOut() {
		accountToggleButton.click();
		SignOut.click();
	}

}
