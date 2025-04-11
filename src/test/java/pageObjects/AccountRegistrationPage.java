package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstname;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastname;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement telephone;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='confirm']")
	WebElement passwordConfirm;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement agree;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement accountCreated;

	public void setFname(String fname) {
		firstname.sendKeys(fname);
	}

	public void setlname(String lname) {
		lastname.sendKeys(lname);
	}

	public void setEmail(String em) {
		email.sendKeys(em);
	}

	public void setTelephone(String tele) {
		telephone.sendKeys(tele);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public void setCPassword(String pass) {
		passwordConfirm.sendKeys(pass);
	}

	public void clickContinue() {
		Continue.click();
	}

	public void clickAgree() {
		agree.click();
	}

	public String getAccountCreatedText() {
		try  {
			return accountCreated.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}
}
