package Pages.HeaderBottomLinkPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class PeoplePage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.bio  div:not(.bio)")
	private List<WebElement> listOfObjects;

	// constructor
	public PeoplePage(WebDriver driver) {
		super(driver);
	}

	// actions
	public List<String> getPeopleInfo() {
		visibilityOfAllElements(listOfObjects);
		List<String> infoPeople = new ArrayList<String>();
		for (int i = 0; i < listOfObjects.size(); i++) {
			String s = listOfObjects.get(i).findElement(By.cssSelector("b")).getText();
			String s1 = "";
			if(!(i==14 || i==15)) {
			 s1 = listOfObjects.get(i).findElement(By.cssSelector("div.bio div:not(.bio):not(p) > i, a > i")).getText();
			}
			infoPeople.add(s + " " + s1);
		}
		return infoPeople;
	}
}
