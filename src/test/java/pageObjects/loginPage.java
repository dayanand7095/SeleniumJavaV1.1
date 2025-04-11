package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement inputEmail;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement inputPassword;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginButton;

	public void setEmail(String value) {
		inputEmail.sendKeys(value);
	}

	public void SetPassword(String value) {
		inputPassword.sendKeys(value);
	}

	public void clickLoginbutton() {
		loginButton.click();
	}

}
