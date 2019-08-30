package Pages.AdditionalPages.MoreNewsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class SubjectNewsFeedPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.box.well.well-sm")
	private WebElement formSubject;

	// constructor
	public SubjectNewsFeedPage(WebDriver driver) {
		super(driver);
	}
}
