package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.AdditionalPages.CollectionPages.CollectionPage;
import Pages.MainPage.TopCollections;

public class TopCollectionsTC extends DriverWaitSetup {

	public static final String SEARCH_TERM = "items";

	@Test
	public void testForMoreThan20() throws Exception {
		getWebDriver().navigate().to(URLs.ARCHIVE_MAIN_PAGE);
		TopCollections tc = new TopCollections(getWebDriver());
		tc.pageLoadedWait(getWait());
		Assert.assertTrue(tc.getNumberOfTopCollections() >= 20);
	}

	@Test
	public void testForItems() throws Exception {
		TopCollections tc = new TopCollections(getWebDriver());
		for (int i = 0; i < tc.getTextFromCollections().size(); i++) {
			Assert.assertTrue(tc.getTextFromCollections().get(i).toLowerCase().contains(SEARCH_TERM.toLowerCase()));
		}
	}

	@Test
	public void testForNumbersOfFirstCollection() throws Exception {
		TopCollections tc = new TopCollections(getWebDriver());

		double numFromCollectionFromMain = tc.getResultsFromCollections(0);
		tc.clickOnCollection(0);
		
		CollectionPage cp = new CollectionPage(getWebDriver());
		cp.pageLoadedWait(getWait());
		
		double numFromCollectionAfterClick = cp.getNumberOfResults();
		
		Assert.assertTrue(Math.abs(numFromCollectionAfterClick - numFromCollectionFromMain) > 400);
	}

}
