package Pages.HeaderBottomLinkPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class JobsPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "table#jobs_table tr:not(:first-child)")
	private List<WebElement> listOfElements;

	@FindBy(name = "q")
	private WebElement searchInput;

	@FindBy(css = "a#btn_search_jobs")
	private WebElement searchButton;

	@FindBy(css = "a.link_show_advanced_search")
	private WebElement advancedSearch;

	@FindBy(css = "iframe#resumator-job-frame")
	private WebElement iframe;

	// constructor
	public JobsPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void switchToFrame() {
		frameToBeAvailableAndSwitchToIt(iframe);
	}

	public int getNumberOfJobs() {
		visibilityOfAllElements(listOfElements);
		return listOfElements.size();
	}

	public void sendSearchInput(String s) {
		elementToAppear(searchInput);
		searchInput.sendKeys(s);
	}

	public void clickOnSearchButton() {
		elementToAppear(searchButton);
		searchButton.click();
	}
}
