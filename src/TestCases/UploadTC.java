package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.AdditionalPages.SignInUpAndUpload.UploadPage;

public class UploadTC extends DriverWaitSetup{
	
	public static final String WANTED_TERM = "Log in or Sign up";
	
	@Test
	public void testUploadNotLoggedIn() throws Exception{
		getWebDriver().navigate().to(URLs.ARCHIVE_MAIN_PAGE);
		UploadPage up = new UploadPage(getWebDriver());
		up.clickOnUpload();
		up.pageLoadedWait(getWait());
		
		Assert.assertTrue(up.getTextFromBoxIfNotSignIn().contains(WANTED_TERM));
	}

}
