package testbase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driverfactory.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import tests.LoginTest;
import util.PropConfig;
import util.ScreenshotUtil;

public class TestBase {
	static Logger log = Logger.getLogger(TestBase.class.getName());
	protected WebDriver driver;
	protected WebDriverWait wait;
	static Properties prop;
	
	
	@BeforeTest
	public void beforeTest()
	{
		String env = System.getProperty("Env");
		prop = PropConfig.init_properties(env);
	}
	
	
	@BeforeMethod
	public void beforeMethod(ITestResult result)
	{
		log.info("--------------Execution started for Testcase " + result.getMethod().getMethodName()+ "---------");
		String browser = prop.getProperty("browser");
		DriverFactory df = new DriverFactory();
		driver = df.init_driver(browser);
		String urlValue = prop.getProperty("url");
		driver.get(urlValue);
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	}
	

	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtil.takeScreenshot(driver, result.getMethod().getMethodName());
		}
		driver.quit();
	}


}
