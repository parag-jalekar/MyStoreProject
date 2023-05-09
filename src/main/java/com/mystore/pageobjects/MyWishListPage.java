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
 * @author Parag
 *
 */
public class MyWishListPage extends BaseClass {

	public MyWishListPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h1[@class='page-title']")
	WebElement pageHeading; //My Wish List
	
	@FindBy(xpath="//div[@class='message info empty']")
	WebElement EmptyMessage;
	
	
	public String getPageHeading() {
		return pageHeading.getText();
		
	}
	
	public String getEmptyCartMeassage() {
		return EmptyMessage.getText(); //"You have no items in your wish list."
	}

}
