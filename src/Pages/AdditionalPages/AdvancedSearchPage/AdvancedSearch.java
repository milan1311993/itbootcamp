package Pages.AdditionalPages.AdvancedSearchPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class AdvancedSearch extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.col-sm-7 > input")
	private List<WebElement> listOfInput;

	@FindBy(css = "div.col-sm-2 > select")
	private List<WebElement> listOfDropBox;

	@FindBy(css = "div.col-sm-2 > input")
	private List<WebElement> listOfCustomFieldInput;

	@FindBy(css = "div.row:nth-child(10) > div:nth-child(3) > select")
	private List<WebElement> listOfDateDropBox;

	@FindBy(css = "div.row:nth-child(11) > div:nth-child(3) > select")
	private List<WebElement> listOfDateRangeDropBox;

	@FindBy(css = "#searchForm > div:nth-child(6) > div:nth-child(4) > select:nth-child(1)")
	private WebElement allMediaTypesDropBox;

	@FindBy(css = "input.btn:nth-child(2)")
	private WebElement firstSearchButton;

	// constructor
	public AdvancedSearch(WebDriver driver) {
		super(driver);
	}
}
