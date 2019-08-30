package Pages.HeaderBottomLinkPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class ContactPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.col-md-9 a > img")
	private List<WebElement> listOfMaps;

	// constructor
	public ContactPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnMap(int i) throws Exception {
		visibilityOfAllElements(listOfMaps);
		if (i >= listOfMaps.size()) {
			throw new Exception("Out of bound");
		}
		listOfMaps.get(i).click();
	}

}
