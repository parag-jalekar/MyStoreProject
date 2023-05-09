/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

/**
 * @author user
 * 
 *
 */
public class MyAccountPage extends BaseClass{
	public MyAccountPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='My Orders']")
	WebElement MyOrders;
	
	@FindBy(xpath="//a[text()='My Wish List']")
	WebElement MyWishList;
	
	public boolean validateMyWishList() {
		return MyWishList.isDisplayed();
	}
	
	public boolean validateMyOrders() {
		return MyOrders.isDisplayed();
	}
	
	public MyOrdersPage goToMyOrdersPage() {
		MyOrders.click();
		return new MyOrdersPage();
	}
}
