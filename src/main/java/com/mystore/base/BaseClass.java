package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  BaseClass{
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}
	
	@BeforeTest
	public void loadConfig() {
	
	System.out.println("Super contructor invoked");
	
	prop = new Properties();
	try {
		 
		FileInputStream ip = new FileInputStream(
				System.getProperty ("user.dir")+"\\configuration\\config.properties");
		try {
			prop.load(ip);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
	}
	//Webdriver selection and application launching
	
	
//LaunchApp method called in BeforeMethod annotation in test related class
	public static void launchApp() throws InterruptedException {
		
			
		String browsername=prop.getProperty("browser");
		
		if(browsername.contains("chrome")){
			System.out.println("Test Initiated in Chrome driver");

			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-java-2020-09-R-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
			 ChromeOptions co = new ChromeOptions();
	    	 co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			
		} else if(browsername.contains("firefox")){
		driver= new FirefoxDriver();
		System.out.println("Test running in Firefox Browser");
		}else if(browsername.contains("edge")){
		driver= new EdgeDriver();
		System.out.println("Test running in Egde Browser");
		}
		
	    Action.implicitWait(driver,10);
	    Action.pageLoadTimeOut(driver,10);
	    driver.get(prop.getProperty("url"));
	    IndexPage indexPage = new IndexPage();
	}
	
	public HomePage login() {
		IndexPage indexPage= new IndexPage();
		LoginPage loginPage=indexPage.clickOnSignIn();
		HomePage homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		return homePage;
	}

}
