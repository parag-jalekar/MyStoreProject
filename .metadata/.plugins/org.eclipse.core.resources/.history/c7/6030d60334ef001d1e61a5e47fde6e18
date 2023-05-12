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
public class IndexPage extends BaseClass{
	
	public IndexPage() {
		
		
		 PageFactory.initElements(driver, this);
	 }
	
	
@FindBy (xpath= "//a[contains(text(),'Sign In')]")
WebElement signIn;

@FindBy (xpath= "//a[@class='logo']/img")
WebElement myStoreLogo;

@FindBy (xpath= "//input[id='search']")
WebElement searchProductBox;

@FindBy (xpath="//button[@class='action search']")
WebElement searchButton;





public LoginPage clickOnSignIn() {
		signIn.click();
		return new LoginPage();
}

public boolean validateLogo(){
	 return myStoreLogo.isDisplayed();
}

public String getMyStoreTitle() {
	 String myStoreTitle=driver.getTitle();
	 return myStoreTitle;
}

public SearchResultPage searchProduct(String productName) {
	 searchProductBox.sendKeys(productName);
	 searchButton.click();
	 return new SearchResultPage();
}

}
