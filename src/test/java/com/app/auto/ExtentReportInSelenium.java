package com.app.auto;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportInSelenium {

	public static void main(String[] args) {
		
		//Generates the report file with MyExtentReport.html
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("MyExtentReport.html");
		ExtentReports report = new ExtentReports();
		//help to add the report in html file
		report.attachReporter(htmlreport);
		
		ExtentTest test;
		//setting up the environment configuration
		report.setSystemInfo("Laptop", "Lenovo");
		report.setSystemInfo("OS Version", "Windows 11");
		report.setSystemInfo("RAM", " 16 GB");
		report.setSystemInfo("Processor", " Intel core i5");
		
		//Configuration of report for look and feel
		htmlreport.config().setDocumentTitle("First Extent Report");
		htmlreport.config().setReportName("Sauce Lab E-commerse site");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setTimeStampFormat("dd-mm-yyyy");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		test = report.createTest("Sauce lab Test");
		//adding the log in report
		test.log(Status.PASS, MarkupHelper.createLabel("Sauce Lab : Pass", ExtentColor.CYAN));
		//generates the report
		report.flush();
	}

}
