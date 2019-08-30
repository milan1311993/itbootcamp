package Pages.HeaderPages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class HeaderMenu extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "ul.navbar-main li.pull-left")
	private List<WebElement> listOfSixIcons;

	@FindBy(css = "a.navbar-brand span.iconochive-logo")
	private WebElement logo;

	@FindBy(css = "li.dropdown-ia:nth-child(10)")
	private WebElement signInButton;

	@FindBy(css = "a#user-menu")
	private WebElement userAfterLogIn;

	@FindBy(css = "li.dropdown:nth-child(9)")
	private WebElement uploadButton;

	@FindBy(name = "search")
	private WebElement searchInput;

	@FindBy(css = "div#navbar_search_options fieldset > label")
	private List<WebElement> listOfSearchOptions;

	@FindBy(css = "a.search-options__advanced-search-link")
	private WebElement advancedSearchOption;

	// constructor
	public HeaderMenu(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnHeaderMenuIcon(int i) throws Exception {
		visibilityOfAllElements(listOfSixIcons);
		if (i >= listOfSixIcons.size()) {
			throw new Exception("Out of bounds");
		}
		listOfSixIcons.get(i).click();
	}

	public void clickOnLogo() {
		elementToAppear(logo);
		logo.click();
	}

	public void clickOnUpload() {
		elementToAppear(uploadButton);
		uploadButton.click();
	}

	public void clickOnUserAfterLogIn() {
		elementToAppear(userAfterLogIn);
		userAfterLogIn.click();
	}

	public void clickOnSignIn() {
		elementToAppear(signInButton);
		signInButton.click();
	}

	public void clickOnSearch() {
		elementToAppear(searchInput);
		searchInput.click();
	}

	public void sendStringInputSearch(String s) {
		elementToAppear(searchInput);
		searchInput.sendKeys(s);
	}
	
	public void clickEnter() {
		searchInput.sendKeys(Keys.ENTER);
	}
}
