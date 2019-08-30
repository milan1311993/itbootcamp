package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.AdditionalPages.SignInUpAndUpload.LogInPage;
import Pages.AdditionalPages.SignInUpAndUpload.SignUpPage;
import Pages.HeaderPages.HeaderMenu;

public class ForgotPassTermsOfServiceTC extends DriverWaitSetup {
	
	public static final String WANTED_TERM = "terms";

	@Test
	public void forgotPass() throws Exception {
		getWebDriver().navigate().to(URLs.ARCHIVE_MAIN_PAGE);
		HeaderMenu hp = new HeaderMenu(getWebDriver());
		hp.clickOnSignIn();
		LogInPage lp = new LogInPage(getWebDriver());
		lp.pageLoadedWait(getWait());

		Assert.assertTrue(getWebDriver().getPageSource().contains(lp.linkForForgetPass()));
		
		lp.clickOnSignUp();
		SignUpPage sp = new SignUpPage(getWebDriver());
		sp.clickOnTermsOfService();
		
		Assert.assertTrue(sp.getChildWindow().contains(WANTED_TERM));
	
	}

}
