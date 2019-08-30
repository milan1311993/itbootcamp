package Pages.AdditionalPages.MoreNewsPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class MoreLinkFromNewsPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "tr.forumRow")
	private List<WebElement> listOfElements;

	@FindBy(css = ".box > h1:nth-child(1) > a:nth-child(1)")
	private WebElement iconBesideNews;

	// constructor
	public MoreLinkFromNewsPage(WebDriver driver) {
		super(driver);
	}
}
