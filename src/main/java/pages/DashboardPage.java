package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageUtility.PageUtility;

public class DashboardPage extends PageUtility
{
	WebDriver driver;
	public DashboardPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css=".logout-btn")
	private WebElement logoutbutton;
	
	public void clickOnLogout()
	{
		clickMe(logoutbutton);
	}

}
