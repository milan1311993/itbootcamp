package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.AdditionalPages.SignInUpAndUpload.LogInPage;
import Pages.HeaderPages.HeaderMenu;

public class SignInTC extends DriverWaitSetup {

	public static final String USER_NAME = "foo@gmail.com";
	public static final String PASSWORD = "bar";
	public static final String MESSAGE_ERROR = "Email address and/or Password incorrect.";

	@Test
	public void logInButtonIsPresent() throws Exception {
		getWebDriver().navigate().to(URLs.ARCHIVE_MAIN_PAGE);
		HeaderMenu hm = new HeaderMenu(getWebDriver());
		hm.clickOnSignIn();
		LogInPage lip = new LogInPage(getWebDriver());
		lip.pageLoadedWait(getWait());

		Assert.assertTrue(getWebDriver().getPageSource().contains("submit-to-login"));

		lip.sendUserName(USER_NAME);
		lip.sendPass(PASSWORD);
		lip.clickLogIn();

		Assert.assertTrue(lip.getTextMessage().equals(MESSAGE_ERROR));
	}

}
