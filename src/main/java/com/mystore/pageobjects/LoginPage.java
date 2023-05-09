package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {
	 public LoginPage() {
		 PageFactory.initElements(driver, this);
		 
	 }
	 @FindBy(id="email") 
	 WebElement userName;
	 
	 @FindBy(id="pass")
	 WebElement password;
	 
	 @FindBy(id="send2")
	 WebElement signInButton;
	 
	 @FindBy(xpath="//a[@class='action remind']")
	 WebElement forgotPasswordLink;
	 
	 @FindBy(xpath="//a[@class='action create primary']")
	 WebElement createAnAccountButton;
	 
	 //Login Method
	public HomePage login(String username, String password) {
		userName.sendKeys(username); //parag@abc.com
		this.password.sendKeys(password); //parag@31
		signInButton.click();
		return new HomePage();   
	}
	public AccountCreationPage createNewAccount() {
		createAnAccountButton.click();
		return new AccountCreationPage();
	}
}
