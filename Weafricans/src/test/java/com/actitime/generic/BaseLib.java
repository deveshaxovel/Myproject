package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib 
{
	
	public WebDriver driver;
	@BeforeMethod
	@Parameters(value={"browser"})
	public void preCondition(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Weafricans\\src\\test\\resources\\Exefiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			Reporter.log("Firefox launched",true);
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Weafricans\\src\\test\\resources\\Exefiles\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver","E:\\Weafricans\\src\\test\\resources\\Exefiles\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("Chrome launched",true);
		}
		else if (browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Weafricans\\src\\test\\resources\\Exefiles\\geckodriver.exe");
			System.setProperty("webdriver.ie.driver","E:\\Weafricans\\src\\test\\resources\\Exefiles\\IEDriverServer.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("IE launched",true);
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","E:\\Weafricans\\src\\test\\resources\\Exefiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			Reporter.log("Firefox launched",true);
		}
		driver.manage().window().maximize();
		driver.get(GetPropertiesValues.getPropertyValues("testURL"));
		WaitStatementLib.implicitWaitForSeconds(driver, 20);

	}
	@AfterMethod
	public void postCondition(ITestResult result)
	{
		if(result.isSuccess())
		{
			Reporter.log("Script Passed",true);
		}
		else
		{
			String fileName = result.getMethod().getMethodName();
			ScreenShotLib slib = new ScreenShotLib();
		    slib.getScreenshot(driver, fileName);
			Reporter.log("Screenshot has been taken",true);
		}
		driver.close();
		Reporter.log("Browser closed",true);

	}


}
