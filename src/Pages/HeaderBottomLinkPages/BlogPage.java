package Pages.HeaderBottomLinkPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.PageFactoryInitWaiters;

public class BlogPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "ul#menu-menu > li")
	private List<WebElement> listOfNavMenuLinks;

	@FindBy(css = "a.shareitem:nth-child(1)")
	private WebElement faceBookButton;

	@FindBy(css = "a.shareitem:nth-child(2)")
	private WebElement twitterButton;

	@FindBy(css = "select#archives-dropdown-2")
	private WebElement archivesDropDown;

	@FindBy(css = "select#archives-dropdown-2 > option")
	private List<WebElement> listOfDropDownValues;

	@FindBy(name = "s")
	private WebElement searchInput;

	@FindBy(css = "input#searchsubmit")
	private WebElement searchButton;

	@FindBy(css = "[id^='post-']")
	private List<WebElement> listOfDynamicElements;

	// constructor
	public BlogPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnFaceBook() {
		elementToAppear(faceBookButton);
		faceBookButton.click();
	}

	public void clickOnTwitter() {
		elementToAppear(twitterButton);
		twitterButton.click();
	}

	public void sendInputSearch(String s) {
		elementToAppear(searchInput);
		searchInput.sendKeys(s);
	}

	public void clickOnSearchButton() {
		elementToAppear(searchButton);
		searchButton.click();
	}

	public void selectFromDropDown(String s) {
		elementToAppear(archivesDropDown);
		Select dropdown = new Select(archivesDropDown);
		dropdown.selectByVisibleText(s);
	}

	public String getValueFromDropDownMenu(int i) {
		return listOfDropDownValues.get(i).getText();
	}
}
