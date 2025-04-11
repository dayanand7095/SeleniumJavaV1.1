package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends BasePage {

	public myAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement myAccountText;
	@FindBy(xpath = "(//a[text()='Logout'])[2]")
	WebElement logoutButtonLink;

	public boolean ismyAccountPagedisplay() {
		try {
			return myAccountText.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickLogout() {
		logoutButtonLink.click();
	}

}
