package Pages.AdditionalPages.CollectionPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class CollectionPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "span.big-label.blue-pop > a:not(.hidden)")
	private List<WebElement> listOfSortByCriteria;

	@FindBy(css = "div.results div.item-ia:not(:first-child)")
	private List<WebElement> listOfResults;

	@FindBy(css = "div.welcome-right > *:not(div):not(br)")
	private List<WebElement> listOfPlayOptions;

	@FindBy(css = "div.is-open input")
	private List<WebElement> criteriaRadioButton;

	@FindBy(css = "div.fatable input")
	private List<WebElement> listOfCheckBox;

	@FindBy(css = "div.results_count")
	private WebElement numberOfResults;

	@FindBy(css = "div.facets_collapser.collapse div.collapse > a")
	private List<WebElement> listOfMoreButtons;

	@FindBy(css = "input.form-control:nth-child(1)")
	private WebElement searchThisCollectionInput;

	@FindBy(css = "#tabby-about-finder")
	private WebElement aboutButton;

	// constructor
	public CollectionPage(WebDriver driver) {
		super(driver);
	}
	
	//actions
	public double getNumberOfResults() {
		elementToAppear(numberOfResults);
		String number = numberOfResults.getText();
		double numberOnly= Double.parseDouble(number.replaceAll("[^0-9]", ""));
		return numberOnly;
	}

}
