package seleniumAutoCode;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateRedBus_ExplicitWait {

	// standard syntax to write wait conditions --
		// implicit wait --internal wait
		// explicit wait - external wait.

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.redbus.in/"); // navigate to url

			// webdriver object, time (wait time)
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// From City
			driver.findElement(By.id("src")).sendKeys("PUNE");
			wait.until(
			ExpectedConditions.
			visibilityOfElementLocated(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/div"))).click();

//			driver.findElement(
//					By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/div"))
//					.click();

			// To City
			driver.findElement(By.id("dest")).sendKeys("Mumbai");

			driver.findElement(
					By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[3]/div"))
					.click();

			// Calender
			driver.findElement(By.id("onwardCal")).click();

			driver.findElement(
					By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[3]/div"))
					.click();

			// Date
			driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[4]/div/div[2]"))
					.click();

			// Search Button
			driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/button")).click();

			// Result
			System.out.println(driver.findElement(By.xpath(
					"/html/body/section/div[2]/div[4]/div/div[2]/div/div[2]/div[2]/div/ul/div[2]/li/div[1]/div/div[1]/div[1]/div[1]/div[1]"))
					.getText());

			driver.close();
		}
}
