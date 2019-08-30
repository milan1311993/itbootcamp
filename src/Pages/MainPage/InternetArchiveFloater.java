package Pages.MainPage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class InternetArchiveFloater extends PageFactoryInitWaiters {

	// elements
	@FindBy(name = "search")
	private WebElement searchInput;

	@FindBy(css = "div#search_options")
	private WebElement searchOptions;

	@FindBy(css = "a.search-options__advanced-search-link")
	private WebElement advancedSearch;

	@FindBy(css = "button.input-sm")
	private WebElement buttonGoSearch;

	@FindBy(css = "center.mt-big > a")
	private List<WebElement> listOfNineIconsFromArchiveFloater;

	@FindBy(css = "div.pull-right > a")
	private WebElement seeMoreLink;

	// constructor
	public InternetArchiveFloater(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnIcon(int i) throws Exception {
		visibilityOfAllElements(listOfNineIconsFromArchiveFloater);
		if (i >= listOfNineIconsFromArchiveFloater.size()) {
			throw new Exception("Out of bounds");
		}
		listOfNineIconsFromArchiveFloater.get(i).click();
	}
	
	public String lastWordFromHref(int i) {
		visibilityOfAllElements(listOfNineIconsFromArchiveFloater);
		Pattern p = Pattern.compile("[^/]*$");
		Matcher m = p.matcher(listOfNineIconsFromArchiveFloater.get(i).getAttribute("href"));
		while (m.find()) {
			return m.group();
		}
		return null;
	}
	
	public void clickOnSearch() {
		elementToAppear(searchInput);
		searchInput.click();
	}
	
	public void sendInputSearch(String s) {
		searchInput.sendKeys(s);
	}
	
	public void clickOnGoButton() {
		buttonGoSearch.click();
	}
	
	public WebElement getOptionsSearch() {
		return searchOptions;
	}
	
	public List<WebElement> getListOfIconsFromFloater() {
		return listOfNineIconsFromArchiveFloater;
	}

}
