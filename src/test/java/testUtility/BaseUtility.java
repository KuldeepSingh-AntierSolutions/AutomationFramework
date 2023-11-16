package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;

public class BaseUtility 
{
	public WebDriver driver;
	public Homepage homepage;
	
	public WebDriver initializeDriver()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public Homepage launchBrowser()
	{
		initializeDriver();
		homepage=new Homepage(driver);
		homepage.launchUrl();
		return homepage;
	}
	
	public void exitBrowser()
	{
		driver.close();
	}
}
