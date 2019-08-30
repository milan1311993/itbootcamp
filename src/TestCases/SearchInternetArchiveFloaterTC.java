package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.MainPage.InternetArchiveFloater;

public class SearchInternetArchiveFloaterTC extends DriverWaitSetup{
	
	public static final String SEARCH_TERM = "qa";
	public static final String REQUESTED_TERM_URL = "?query=qa";
	
	@Test
	public void search() throws Exception{
		getWebDriver().navigate().to(URLs.ARCHIVE_MAIN_PAGE);
		InternetArchiveFloater iaf = new InternetArchiveFloater(getWebDriver());
	
		iaf.clickOnSearch();
		
		Assert.assertTrue(iaf.getOptionsSearch().getAttribute("aria-expanded").equals("true"));
		
		iaf.sendInputSearch(SEARCH_TERM);
		iaf.clickOnGoButton();
		iaf.invisibilityOfAllElements(iaf.getListOfIconsFromFloater());
		
		Assert.assertTrue(getWebDriver().getCurrentUrl().contains(REQUESTED_TERM_URL));
		
		
	}

}
