package seleniumAutoCode;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagname {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://google.co.in");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("number of links " + links.size());
		
		System.out.println(links.get(0).getText());
		System.out.println(links.get(1).getText());
		
		for(int i=0 ; i< links.size(); i++) {
			System.out.println( "no. " + i + "---" + links.get(i).getText());
			
		}
	}
}
