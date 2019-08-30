package Pages.HeaderPages;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class HeaderHiddenMenu extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.wayback-txt > a")
	private WebElement webPagesButtonFromSearchPanel;

	@FindBy(css = "div.col-sm-6:nth-child(1)")
	private WebElement wayBackMachineLogoFromSearchPanel;

	@FindBy(name = "url")
	private WebElement searchInputFromSearchPanel;

	@FindBy(css = "div.row.toprow.fivecolumns[style*=block] > div.col-sm-2.col-xs-5")
	private List<WebElement> placeholderForRoundShapeIcons;

	@FindBy(css = "div.row.toprow.fivecolumns[style*=block] > div.col-sm-2.col-xs-7 a")
	private List<WebElement> placeholderForLinksFromHeader;

	// constructor
	public HeaderHiddenMenu(WebDriver driver) {
		super(driver);
	}

	// actions
	public void sendInputString(String s) {
		elementToAppear(searchInputFromSearchPanel);
		searchInputFromSearchPanel.sendKeys(s);
	}

	public void clickEnter() {
		elementToAppear(searchInputFromSearchPanel);
		this.searchInputFromSearchPanel.sendKeys(Keys.ENTER);
	}

	public void clickRoundShapeIcon(int i) throws Exception {
		visibilityOfAllElements(placeholderForRoundShapeIcons);
		if (i >= placeholderForRoundShapeIcons.size()) {
			throw new Exception("Out of bounds");
		}
		placeholderForRoundShapeIcons.get(i).click();
	}

	public void clickOnLinkFromHeaderMenu(int i) throws Exception {
		visibilityOfAllElements(placeholderForLinksFromHeader);
		if (i >= placeholderForLinksFromHeader.size()) {
			throw new Exception("Out of bounds");
		}
		placeholderForLinksFromHeader.get(i).click();
	}

	public String lastWordFromHref(int i) {
		visibilityOfAllElements(placeholderForLinksFromHeader);
		Pattern p = Pattern.compile("[^/]*$");
		Matcher m = p.matcher(placeholderForLinksFromHeader.get(i).getAttribute("href"));
		while (m.find()) {
			return m.group();
		}
		return null;
	}
}
