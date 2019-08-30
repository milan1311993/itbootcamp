package Pages.HeaderBottomLinkPages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class HelpPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(name = "query")
	private WebElement searchInput;

	@FindBy(css = "ul.blocks-list > li")
	private List<WebElement> buttonsFromHelpPage;

	@FindBy(css = "a.login")
	private WebElement signInButton;

	// constructor
	public HelpPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnButtonFromHelpPage(int i) throws Exception {
		visibilityOfAllElements(buttonsFromHelpPage);
		if (i >= buttonsFromHelpPage.size()) {
			throw new Exception("Out of bounds");
		}
		buttonsFromHelpPage.get(i).click();
	}

	public void sendSearchInput(String s) {
		elementToAppear(searchInput);
		searchInput.sendKeys(s);
	}

	public void clickEnter() {
		searchInput.sendKeys(Keys.ENTER);
	}

	public void clickOnSignIn() {
		elementToAppear(signInButton);
		signInButton.click();
	}
}
