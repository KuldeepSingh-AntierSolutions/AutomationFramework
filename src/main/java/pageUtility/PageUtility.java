package pageUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility 
{
	WebDriver driver;
	
	public PageUtility(WebDriver driver) 
	{
		this.driver=driver;
	}


	public void waitForElementToAppear(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitForElementToBeClickable(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void clickMe(WebElement ele)
	{
		waitForElementToAppear(ele);
		ele.click();
	}
}
