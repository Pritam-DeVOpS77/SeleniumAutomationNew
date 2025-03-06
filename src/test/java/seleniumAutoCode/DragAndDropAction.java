package seleniumAutoCode;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	
	static WebDriver driver;
	static String URL = "";
	public static void main(String[] args) {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act = new Actions(driver);
        
        WebElement mainFrame = driver.findElement(By.xpath("//iframe[@name='demo-frame']"));
        
        driver.switchTo().frame(mainFrame);

        WebElement Dragable = driver.findElement(By.id(""));
        WebElement Dropable = driver.findElement(By.id(""));
        
        act.dragAndDrop(Dragable,Dropable).perform();

   }
}