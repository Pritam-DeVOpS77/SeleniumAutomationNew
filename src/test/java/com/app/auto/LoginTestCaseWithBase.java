package com.app.auto;

import java.io.IOException;

import org.testng.annotations.Test;
import com.ReuseableBase.BaseUtil;

public class LoginTestCaseWithBase extends BaseUtil {	
	@Test
	public void login() throws IOException, InterruptedException 
	{
		launchBrowser("Chrome");
		launchURL("applicationURL");
		validateTitleOfThePage("Swag Labs");
		isElementVisible("username_xpath");
		EnterData("username_xpath","standard_user");
		//isElementVisible("password_xpath");
		EnterData("password_xpath","secret_sauce");
		ClickAction("submitButton_xpath");
		Thread.sleep(2000);
		takingScreenShot();
		scrollAction();	
		moveToElement("visitElement_id");
	}
}
