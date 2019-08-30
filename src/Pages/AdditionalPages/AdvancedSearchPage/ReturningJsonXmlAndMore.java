package Pages.AdditionalPages.AdvancedSearchPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class ReturningJsonXmlAndMore extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "#rawform > input:nth-child(2)")
	private WebElement queryInput;

	@FindBy(css = "#rawform > div:nth-child(5) > select")
	private List<WebElement> listOfOptionalSortResults;

	@FindBy(css = "#numresults")
	private WebElement numberOfResultsInput;

	@FindBy(css = "input.pull-right:nth-child(2)")
	private WebElement pageInput;

	@FindBy(css = "table.table-bordered input[type=radio]")
	private List<WebElement> listOfRadioButtons;

	@FindBy(css = ".table > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > input:nth-child(2)")
	private WebElement saveToFileCheckBox;

	@FindBy(css = ".table > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > a:nth-child(2)")
	private WebElement secondSearchButton;

	@FindBy(css = "input.btn:nth-child(18)")
	private WebElement showHideHelpByCsvFormatButton;

	@FindBy(css = "#rawform > div:nth-child(4) > select:nth-child(2)")
	private WebElement fieldsToReturnPickOneOrMore;

	// constructor
	public ReturningJsonXmlAndMore(WebDriver driver) {
		super(driver);
	}
}
