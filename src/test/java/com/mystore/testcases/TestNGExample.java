package com.mystore.testcases;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExample extends BaseClass {

    

    @Test
    public void testWebsite() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
      
        Action.pageLoadTimeOut(driver, 10);
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);
        
    }
 
    
    @Test
    public void searchItem() throws InterruptedException {
    	System.out.println("test to find shirt");
    	
    	driver.get("https://magento.softwaretestingboard.com/");
    	        WebElement searchBox = driver.findElement(By.id("search"));
    	        // Perform actions on the element
    	      
    	        searchBox.sendKeys("shirt");
    	        System.out.println("input in searchbox");
    	        WebElement searchButton=driver.findElement(By.xpath("//button[@class='action search']"));
    	        searchButton.click();
    	        System.out.println("Tryied");
    	       
    	 
    	    }
    @Test
    public void signIn(){
    	driver.get("https://magento.softwaretestingboard.com/");
    	WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
    	signIn.click();
    	//"//a[contains(text(),'Sign In']"
    }

    	   
    	   
  

  

   
}

