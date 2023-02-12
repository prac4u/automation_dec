package util;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	
	static Logger log = Logger.getLogger(ElementUtils.class.getName());
	
	WebDriver driver;
	
	public ElementUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void doClick(By locator)
	{
		log.info("Inside doClick Method");
		//System.out.println("Inside doClick Method");
		log.info("Locator : " + locator);
		//System.out.println("Locator : " + locator);
		try {
		driver.findElement(locator).click();
		//System.out.println("Click successful");
		log.info("Click successful");
		}
		catch(Exception e)
		{
			//System.out.println("Click not successful");
			log.error("Click not successful");
			log.error(e.toString());
			//e.printStackTrace();
		}
	
		
	}
	
	public void doClick(String xpath)
	{
		log.info("Inside doClick Method");
		log.info("Xpath : " + xpath);
		try {
		driver.findElement(By.xpath(xpath)).click();
		log.info("Click successful");
		}
		catch(Exception e)
		{
			log.error("Click not successful");
			log.error(e.toString());
			//e.printStackTrace();
		}
	
	}
	
	public void doClick(WebElement ele)
	{
		log.info("Inside doClick Method with WebElement");
		
		try {
		ele.click();
		log.info("Click successful");
		}
		catch(Exception e)
		{
			log.error("Click not successful");
			
			log.error(e.toString());
		}
	
	}
	
	
	
	public void enterText(By locator, String text)
	{
		log.info("Inside enterText Method");
		log.info("Locator : " + locator);
		try {
			driver.findElement(locator).sendKeys(text);
			log.info("Text Entered successfully");
		}
		catch(Exception e)
		{
			log.info("Text not Entered successfully");

			log.error(e.toString());
		}
		
	}
	
	
	public boolean isElementPresent(By locator, int time)
	{
		System.out.println("Inside isElementPresent Method");
		System.out.println("Locator : " + locator);
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver,time);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			log.info("Element is present within " + time);
			return true;
				
		}
		catch(TimeoutException e)
		{
			log.info("Element is not present");
			e.printStackTrace();
			return false;
		}
	}
	

}
