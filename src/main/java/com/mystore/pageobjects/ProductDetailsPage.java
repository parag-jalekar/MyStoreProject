/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

/**
 * @author user
 *
 */
public class ProductDetailsPage extends BaseClass {
	public ProductDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@title='Add to Cart']")
	WebElement addToCartButton;
	
	public void addToCart() {
		addToCartButton.click();
		
	}

}
