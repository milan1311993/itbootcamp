package Pages.AdditionalPages.SignInUpAndUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class UploadPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = ".nav-upload")
	private WebElement uploadFilesButton;

	@FindBy(css = ".btn-primary")
	private WebElement liveMusicArchiveUploaderButton;

	@FindBy(css = "a.stealth:nth-child(1)")
	private WebElement clickableQuestionMarkButton;

	@FindBy(css = "#maincontent > div > p > b:nth-child(5)")
	private WebElement notLoggedInBox;
	// constructor
	public UploadPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void clickOnUpload() {
		elementToAppear(uploadFilesButton);
		uploadFilesButton.click();
	}
	
	public String getTextFromBoxIfNotSignIn() {
		elementToAppear(notLoggedInBox);
		return notLoggedInBox.getText();
	}
	
}
