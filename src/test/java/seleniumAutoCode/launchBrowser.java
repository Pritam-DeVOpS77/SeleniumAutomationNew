package seleniumAutoCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
	
	    //control + shift + o  --> to import interfaces 
			
		WebDriver driver = new ChromeDriver(); // compile time/checked // lunch the browser
		
		driver.manage().window().maximize(); // maximized the browser.
					
		// open the website
					
		driver.get("https://www.google.co.in");
		
		driver.close(); // close the browser
	}
}
