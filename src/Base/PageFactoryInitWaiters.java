package Base;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class PageFactoryInitWaiters extends DriverWaitSetup {

	// constructor
	public PageFactoryInitWaiters(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// waiters
	public void pageLoadedWait(WebDriverWait wait) {
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				System.out.println(((JavascriptExecutor) driver).executeScript("return document.readyState"));
				return (((JavascriptExecutor) driver).executeScript("return document.readyState")).equals("complete");
			}
		});
	}

	public void elementToAppear(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void elementToAppear(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void elementToAppear(By locator, By locator2) {
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2)));
	}

	public void elementToAppear(WebElement element, WebElement element2) {
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(element),
				ExpectedConditions.visibilityOf(element2)));
	}

	public void elementToAppear(By locator, By locator2, By locator3) {
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2),
				ExpectedConditions.visibilityOfElementLocated(locator3)));
	}

	public void elementToBeClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void urlToContain(String url) {
		wait.until(ExpectedConditions.urlContains(url));
	}

	public void visibilityOfElements(List<WebElement> elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public void attributeContains(WebElement locator, String attribute, String value) {
		wait.until(ExpectedConditions.attributeContains(locator, attribute, value));
	}

	public void attributeContains(By locator, String attribute, String value) {
		wait.until(ExpectedConditions.attributeContains(locator, attribute, value));
	}

	public void attributeToBe(By locator, String attribute, String value) {
		wait.until(ExpectedConditions.attributeToBe(locator, attribute, value));
	}

	public void attributeToBe(WebElement element, String attribute, String value) {
		wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
	}

	public void attributeToBeNotEmpty(WebElement element, String attribute) {
		wait.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
	}

	public void elementSelectionStateToBe(By locator, boolean selected) {
		wait.until(ExpectedConditions.elementSelectionStateToBe(locator, selected));
	}

	public void visibilityOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void elementSelectionStateToBe(WebElement element, boolean selected) {
		wait.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
	}

	public void elementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void elementToBeSelected(By locator) {
		wait.until(ExpectedConditions.elementToBeSelected(locator));
	}

	public void elementToBeSelected(WebElement element) {
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public void frameToBeAvailableAndSwitchToIt(By locator) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}

	public void frameToBeAvailableAndSwitchToIt(int frameLocator) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public void frameToBeAvailableAndSwitchToIt(java.lang.String frameLocator) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public void frameToBeAvailableAndSwitchToIt(WebElement frameLocator) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public void invisibilityOf(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void invisibilityOfAllElements(List<WebElement> elements) {
		wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
	}

	public void invisibilityOfElementLocated(By locator) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public void invisibilityOfElementWithText(By locator, String text) {
		wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
	}

	public void javaScriptThrowsNoExceptions(String javaScript) {
		wait.until(ExpectedConditions.javaScriptThrowsNoExceptions(javaScript));
	}

	public void jsReturnsValue(java.lang.String javaScript) {
		wait.until(ExpectedConditions.jsReturnsValue(javaScript));
	}

	public void not(ExpectedCondition<?> condition) {
		wait.until(ExpectedConditions.not(condition));
	}

	public void numberOfElementsToBe(By locator, Integer number) {
		wait.until(ExpectedConditions.numberOfElementsToBe(locator, number));
	}

	public void numberOfElementsToBeLessThan(By locator, Integer number) {
		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(locator, number));
	}

	public void numberOfElementsToBeMoreThan(By locator, Integer number) {
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, number));
	}

	public void numberOfWindowsToBe(int a) {
		wait.until(ExpectedConditions.numberOfWindowsToBe(a));
	}

	public void or(ExpectedCondition<?>... conditions) {
		wait.until(ExpectedConditions.or(conditions));
	}

	public void presenceOfAllElementsLocatedBy(By locator) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public void presenceOfElementLocated(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void presenceOfNestedElementLocatedBy(By locator, By childLocator) {
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(locator, childLocator));
	}

	public void presenceOfNestedElementLocatedBy(WebElement element, By childLocator) {
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, childLocator));
	}

	public void presenceOfNestedElementsLocatedBy(By parent, By childLocator) {
		wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(parent, childLocator));
	}

	public void refreshed(ExpectedCondition<T> condition) {
		wait.until(ExpectedConditions.refreshed(condition));
	}

	public void stalenessOf(WebElement element) {
		wait.until(ExpectedConditions.stalenessOf(element));
	}

	public void textMatches(By locator, Pattern pattern) {
		wait.until(ExpectedConditions.textMatches(locator, pattern));
	}

	public void textToBe(By locator, String value) {
		wait.until(ExpectedConditions.textToBe(locator, value));
	}

	public void textToBePresentInElement(WebElement element, String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	public void textToBePresentInElementLocated(By locator, String text) {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
	}

	public void textToBePresentInElementValue(By locator, String text) {
		wait.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
	}

	public void textToBePresentInElementValue(WebElement element, String text) {
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
	}

	public void titleContains(String title) {
		wait.until(ExpectedConditions.titleContains(title));
	}

	public void titleIs(String title) {
		wait.until(ExpectedConditions.titleIs(title));
	}

	public void urlContains(String fraction) {
		wait.until(ExpectedConditions.urlContains(fraction));
	}

	public void urlMatches(String regex) {
		wait.until(ExpectedConditions.urlMatches(regex));
	}

	public void urlToBe(String url) {
		wait.until(ExpectedConditions.urlToBe(url));
	}

	public void visibilityOf(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void visibilityOfAllElements(List<WebElement> elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public void visibilityOfAllElements(WebElement... elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public void visibilityOfAllElementsLocatedBy(By locator) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public void visibilityOfElementLocated(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void visibilityOfNestedElementsLocatedBy(By parent, By childLocator) {
		wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(parent, childLocator));
	}

	public void visibilityOfNestedElementsLocatedBy(WebElement element, By childLocator) {
		wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(element, childLocator));
	}

	public void alertIsPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void and(ExpectedCondition<?>... conditions) {
		wait.until(ExpectedConditions.and(conditions));
	}
}
