package com.tradeviv.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.tradeviv.pageObjects.AdminLoginPage;

public class TC_AdminLoginTest_001 extends BaseClass 
{
	@Test
	public void adminLoginTest() throws IOException
	{
		
		logger.info("URL is opened");
		AdminLoginPage alp=new AdminLoginPage(driver);
		alp.setAdminId(username);
		alp.setAdminPwd(password);
		alp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver, "TC_AdminLoginTest_001");
	}

}
