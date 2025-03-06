package com.app.auto;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   
	}
	
	@Test
	public void getPageTitle() {
		
		System.out.println("The Title of the Page is : "+driver.getTitle());
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
	}

}
