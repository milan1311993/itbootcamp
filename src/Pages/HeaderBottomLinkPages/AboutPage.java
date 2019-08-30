package Pages.HeaderBottomLinkPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class AboutPage extends PageFactoryInitWaiters{
	
	//elements
	@FindBy(css="tr.forumRow")
	private List<WebElement> listOfNews;
	
	@FindBy(css=".box > h1:nth-child(1) > a")
	private WebElement moreNewsButton;
	
	//constructor
	public AboutPage(WebDriver driver) {
		super(driver);
	}
	
	//actions
	public int getNumberOfNews() {
		visibilityOfAllElements(listOfNews);
		return listOfNews.size();
	}
	
	public void clickOnMoreNewsButton() {
		elementToAppear(moreNewsButton);
		moreNewsButton.click();
	}

}
