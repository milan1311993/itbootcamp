package Pages.HeaderPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class HeaderBottomPageLinks extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "ul#nav-abouts > li")
	private List<WebElement> listOfHeaderLinks;

	// constructor
	public HeaderBottomPageLinks(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnLink(int i) throws Exception {
		visibilityOfAllElements(listOfHeaderLinks);
		if (i >= listOfHeaderLinks.size()) {
			throw new Exception("Out of bounds");
		}
		listOfHeaderLinks.get(i).click();
	}
}
