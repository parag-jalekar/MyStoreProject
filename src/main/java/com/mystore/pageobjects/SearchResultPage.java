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
public class SearchResultPage extends BaseClass{
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='products wrapper grid products-grid'] /ol/li[1]")
	WebElement product;
	
	public ProductDetailsPage goToProduct() {
		product.click();
		return new ProductDetailsPage();
	}

}
