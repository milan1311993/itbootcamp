package Pages.AdditionalPages.SignInUpAndUpload;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class SignUpPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.terms > a")
	private WebElement termsOfService;

	// constructor
	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnTermsOfService() {
		elementToAppear(termsOfService);
		termsOfService.click();
	}

	public String getChildWindow() throws Exception{
		Thread.sleep(3000);
		Set<String> window = getWebDriver().getWindowHandles();
		Iterator iterator = window.iterator();
		String currentWindowId = null;
		String mainPage = getWebDriver().getWindowHandle();
		while (iterator.hasNext()) {
			currentWindowId = iterator.next().toString();

			if (!currentWindowId.equals(mainPage)) {
				getWebDriver().switchTo().window(currentWindowId);
			}
		}
		return getWebDriver().getCurrentUrl();
	}

}
