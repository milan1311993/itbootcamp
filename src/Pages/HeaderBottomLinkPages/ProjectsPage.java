package Pages.HeaderBottomLinkPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class ProjectsPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = "div.col-sm-9")
	private List<WebElement> listOfProjects;

	// constructor
	public ProjectsPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public int getNumberOfProjects() {
		visibilityOfAllElements(listOfProjects);
		return listOfProjects.size();
	}
}
