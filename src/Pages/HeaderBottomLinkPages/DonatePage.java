package Pages.HeaderBottomLinkPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class DonatePage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "ul.donation-radio-list:nth-child(3) > li > label > span")
	private List<WebElement> listOfAmounts;

	@FindBy(css = "li#other_amt span.hit-area")
	private WebElement otherAmountButton;

	@FindBy(css = "input#amount_custom")
	private WebElement otherAmountInputField;

	// constructor
	public DonatePage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnAmount(int i) throws Exception {
		visibilityOfAllElements(listOfAmounts);
		if (i >= listOfAmounts.size()) {
			throw new Exception("Out of bounds");
		}
		listOfAmounts.get(i).click();
	}

	public void clickOnOtherAmount() {
		elementToAppear(otherAmountButton);
		otherAmountButton.click();
	}

	public void sendAmount(String s) {
		elementToAppear(otherAmountInputField);
		otherAmountInputField.sendKeys(s);
	}

}
