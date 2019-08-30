package Pages.AdditionalPages.SignInUpAndUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.PageFactoryInitWaiters;

public class LogInPage extends PageFactoryInitWaiters {

	// elements
	@FindBy(css = ".login-header > p:nth-child(3) > a:nth-child(1)")
	private WebElement signUpButton;

	@FindBy(name = "username")
	private WebElement userNameInput;

	@FindBy(name = "password")
	private WebElement passwordInput;

	@FindBy(css = ".password_icon")
	private WebElement iconToSeePassword;

	@FindBy(css = ".reset-password > a:nth-child(1)")
	private WebElement forgotPassword;

	@FindBy(css = ".input-checkbox")
	private WebElement keepMeLoggedIn;

	@FindBy(css = ".btn")
	private WebElement logInButton;

	@FindBy(css = "div.password-message span.login-error.password-error")
	private WebElement message;

	// constructor
	public LogInPage(WebDriver driver) {
		super(driver);
	}

	// actions
	public void sendUserName(String s) {
		elementToAppear(userNameInput);
		userNameInput.sendKeys(s);
	}

	public void sendPass(String s) {
		elementToAppear(passwordInput);
		passwordInput.sendKeys(s);
	}

	public void clickLogIn() {
		elementToAppear(logInButton);
		logInButton.click();
	}

	public WebElement getLogInButton() {
		return logInButton;
	}

	public String getTextMessage() {
		elementToAppear(message);
		return message.getText().substring(0, message.getText().indexOf(".") + 1);
	}

	public String linkForForgetPass() {
		elementToAppear(forgotPassword);
		return forgotPassword.getAttribute("href");
	}

	public void clickOnSignUp() {
		elementToAppear(signUpButton);
		signUpButton.click();
	}

}
