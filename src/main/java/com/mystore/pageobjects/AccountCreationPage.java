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
public class AccountCreationPage extends BaseClass {
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1/span[@data-ui-id='page-title-wrapper']")
	WebElement accountCreationPageHeading;
	
	public boolean validatePageHeading() {
		String h1=accountCreationPageHeading.getText();
		return h1.equalsIgnoreCase("Create New Customer Account");
	}

}
