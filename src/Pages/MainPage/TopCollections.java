package Pages.MainPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class TopCollections extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.item-ia.collection-ia")
	private List<WebElement> listOfTopCollections;

	// constructor
	public TopCollections(WebDriver driver) {
		super(driver);
	}

	// actions
	public int getNumberOfTopCollections() {
		visibilityOfAllElements(listOfTopCollections);
		return listOfTopCollections.size();
	}

	public List<String> getTextFromCollections() {
		List<String> listOfText = new ArrayList<String>();
		for (int i = 0; i < listOfTopCollections.size(); i++) {
			listOfText.add(listOfTopCollections.get(i)
					.findElement(By.cssSelector("div.item-ia.collection-ia div.num-items.topinblock")).getText());
		}
		return listOfText;
	}

	public Double getResultsFromCollections(int i) {
		String s = getTextFromCollections().get(i);
		Double num = Double.parseDouble(s.replaceAll("[^0-9]", ""));
		return num;

	}

	public void clickOnCollection(int i) throws Exception {
		visibilityOfAllElements(listOfTopCollections);
		if (i >= listOfTopCollections.size()) {
			throw new Exception("Out of bounds");
		}
		listOfTopCollections.get(i).click();
	}

}
