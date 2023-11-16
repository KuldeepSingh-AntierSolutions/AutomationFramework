package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageUtility.PageUtility;


public class Homepage extends PageUtility
{
	WebDriver driver;
	
	public Homepage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchUrl()
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice");
	}
	
	@FindBy(xpath="//a[contains(text(),'orgot')]")
	private WebElement forgotpassword;
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name;
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement email;
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	private WebElement phonenumber;
	@FindBy(css =".reset-pwd-btn")
	private WebElement resetbutton;
	@FindBy(css=".infoMsg")
	private WebElement passwordmessage;
	@FindBy(css=".go-to-login-btn")
	private WebElement gotologinbutton;
	@FindBy(id="inputUsername")
	private WebElement username;
	@FindBy(name="inputPassword")
	private WebElement password;
	@FindBy(id="chkboxOne")
	private WebElement rememberme;
	@FindBy(id="chkboxTwo")
	private WebElement tnc;
	@FindBy(xpath="//button[contains(text(),'Sign')]")
	private WebElement signinbutton;
	
	String newpassword;
	String nameofuser="Kuldeep Singh";
	public void clickOnForgotPassword()
	{
		clickMe(forgotpassword);
	}
	public void fillDetails()
	{
		waitForElementToAppear(name);
		name.sendKeys(nameofuser);
		email.sendKeys("kuldeep@gmail.com");
		phonenumber.sendKeys("9876543210");
	}
	public void clickOnResetLogin()
	{
		resetbutton.click();
	}
	public void extractPassword()
	{
		String infomessage=passwordmessage.getText();
		newpassword=infomessage.split("'")[1];
	}
	public void clickOnGoToLogin()
	{
		gotologinbutton.click();
	}
	public void fillSignInDetails()
	{
		waitForElementToAppear(username);
		username.sendKeys(nameofuser);
		password.sendKeys(newpassword);
	}
	public void clickOnRememberCheckbox()
	{
		Actions act=new Actions(driver);
		act.click(rememberme).build().perform();
	}
	public void clickOnTncCheckbox()
	{
		Actions act=new Actions(driver);
		act.click(tnc).build().perform();
	}
	public DashboardPage clickOnSignIn()
	{
		Actions act=new Actions(driver);
		act.click(signinbutton).build().perform();
		DashboardPage dashboardPage=new DashboardPage(driver);
		return dashboardPage;
	}
	
}