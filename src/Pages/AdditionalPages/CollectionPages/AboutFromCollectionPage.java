package Pages.AdditionalPages.CollectionPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class AboutFromCollectionPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.about-box div.items_list")
	private List<WebElement> listOfContributors;

	@FindBy(css = "div.grafs.about-box")
	private List<WebElement> listOfGraphics;

	@FindBy(css = "div.about-box:nth-child(7) > div:not(:first-child)")
	private List<WebElement> listOfRelatedCollections;

	@FindBy(css = "table.stats-table")
	private WebElement table;

	// constructor
	public AboutFromCollectionPage(WebDriver driver) {
		super(driver);
	}

}
