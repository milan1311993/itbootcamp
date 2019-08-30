package Pages.AdditionalPages.ResultsFromHiddenSearch;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class ResultsFromHiddenSearchPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "ul.result-list > li")
	private List<WebElement> listOfResults;

	// constructor
	public ResultsFromHiddenSearchPage(WebDriver driver) {
		super(driver);
	}
}
