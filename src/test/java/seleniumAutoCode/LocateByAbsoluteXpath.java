package seleniumAutoCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByAbsoluteXpath {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		WebElement emailField = driver
				.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		emailField.sendKeys("nitin@gmail.com");
	}

}
