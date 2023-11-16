package tests;

import org.testng.annotations.Test;

import pages.DashboardPage;
import testUtility.BaseUtility;

public class ForgotPasswordTest extends BaseUtility
{
	@Test
	public void toVerifyForgotPassword()
	{
		launchBrowser();
		homepage.clickOnForgotPassword();
		homepage.fillDetails();
		homepage.clickOnResetLogin();
		homepage.extractPassword();
		homepage.clickOnGoToLogin();
		homepage.fillSignInDetails();
		homepage.clickOnRememberCheckbox();
		homepage.clickOnTncCheckbox();
		DashboardPage dashboardPage=homepage.clickOnSignIn();
		dashboardPage.clickOnLogout();
		exitBrowser();
	}
}
