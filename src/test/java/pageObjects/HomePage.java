package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myAccountLink;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement registerLink;
	@FindBy(linkText = "Login")
	WebElement loginLink;

	public void clickOnMyAccount() {
		myAccountLink.click();
	}

	public void clickOnRegister() {
		registerLink.click();
	}

	public void clickOnLogin() {
		loginLink.click();
	}
}
