package seleniumAutoCode;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingAction {
	static WebDriver driver;
	static String URL = "";
	public static void main(String[] args) {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	    JavascriptExecutor JSE = (JavascriptExecutor) driver;
	        
	    JSE.executeScript("window.scrollBy(0,750)","");
	}
}
