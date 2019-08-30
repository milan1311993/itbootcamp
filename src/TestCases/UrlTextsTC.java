package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.HeaderPages.HeaderHiddenMenu;
import Pages.HeaderPages.HeaderMenu;
import Pages.MainPage.InternetArchiveFloater;

public class UrlTextsTC extends DriverWaitSetup{
	
	@Test
	public void textsUrl() throws Exception{
		getWebDriver().navigate().to(URLs.ARCHIVE_MAIN_PAGE);
		HeaderMenu hm = new HeaderMenu(getWebDriver());
		
		hm.clickOnHeaderMenuIcon(1);
		
		HeaderHiddenMenu hhm = new HeaderHiddenMenu(getWebDriver());
		String hrefFromAllTexts = hhm.lastWordFromHref(0);
		hhm.clickOnLinkFromHeaderMenu(0);
		
		getWebDriver().navigate().back();
		
		InternetArchiveFloater af = new InternetArchiveFloater(getWebDriver());
		String hrefFromTextIcon = af.lastWordFromHref(1);
	
		af.clickOnIcon(1);
	
		Assert.assertTrue(hrefFromAllTexts.equals(hrefFromTextIcon));
	}

}
