package com.app.auto;

import java.io.IOException;

import org.testng.annotations.Test;
import com.ReuseableBase.BaseUtil;

import excelUtility.ReadDataFromExcelFile;

public class LoginTestCaseWithBase extends BaseUtil {	
	
	@Test(dataProvider= "getLoginData", dataProviderClass=ReadDataFromExcelFile.class) 
	//dataProviderClass is created just because that class we have created as separate class
	public void login( String username ,String password) throws IOException, InterruptedException 
	{
		launchBrowser("Chrome");
		launchURL("applicationURL");
		validateTitleOfThePage("Swag Labs");
		isElementVisible("username_xpath");
		EnterData("username_xpath", username);
		//isElementVisible("password_xpath");
		EnterData("password_xpath", password);
		ClickAction("submitButton_xpath");
		Thread.sleep(2000);
		takingScreenShot();
		scrollAction();	
		moveToElement("visitElement_id");
	}
}
