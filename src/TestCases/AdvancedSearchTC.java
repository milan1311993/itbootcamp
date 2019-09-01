package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.AdditionalPages.AdvancedSearchPage.AdvancedSearch;
import Pages.HeaderPages.HeaderBottomPageLinks;
import Pages.HeaderPages.HeaderMenu;

public class AdvancedSearchTC extends DriverWaitSetup {

	public static final String ADVANCED_SEARCH_LINK = "https://archive.org/advancedsearch.php";
	public static final String TERM = "advancedsearch";
	public static final String YEAR = "2015";
	public static final String MONTH = "09";
	public static final String DAY = "09";
	public static final String URL_CONTAIN_TERM = "?query=date%3A2015-09-09";
	public static final String SEARCH_INPUT = "date:2015-09-09";

	@Test
	public void testingAdvancedSearch() throws Exception {
		getWebDriver().navigate().to(URLs.ARCHIVE_MAIN_PAGE);
		HeaderMenu hm = new HeaderMenu(getWebDriver());
		HeaderBottomPageLinks hbpl = new HeaderBottomPageLinks(getWebDriver());
		hbpl.clickOnLink(0);
		hm.clickOnSearch();

		Assert.assertTrue(getWebDriver().getPageSource().contains(ADVANCED_SEARCH_LINK));
		
		hm.clickOnAdvancedSearch();
		AdvancedSearch as = new AdvancedSearch(getWebDriver());
		as.pageLoadedWait(getWait());
		
		Assert.assertTrue(getWebDriver().getCurrentUrl().contains(TERM));
		
		as.clickOnDate(YEAR, MONTH, DAY);
		as.clickOnSearchButton();
		Thread.sleep(3000);
		
		Assert.assertTrue(getWebDriver().getCurrentUrl().contains(URL_CONTAIN_TERM));
		Assert.assertTrue(hm.getSearchInput().getAttribute("value").equals(SEARCH_INPUT));
	}

}
