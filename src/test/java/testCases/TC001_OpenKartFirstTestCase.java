package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_OpenKartFirstTestCase extends BaseClass {

	@Test(groups={"sanity","Master"})
	public void testOpenKart() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

		// Code to open application
		logger.info("***** Starting TC001_OpenKartFirstTestCase *****");

		try {

			HomePage homePage = new HomePage(driver);
			AccountRegistrationPage accountRegistrationPage;
			driver.get(p.getProperty("appUrl"));
			Thread.sleep(10000);
			// Code to click on My Account
			homePage.clickOnMyAccount();
			logger.info("***** My Account clicked *****");
			// Code to click on Register
			Thread.sleep(50000);
			homePage.clickOnRegister();
			logger.info("***** Register clicked *****");
			Thread.sleep(50000);
			accountRegistrationPage = new AccountRegistrationPage(driver);
			logger.info("***** Entering Account Details *****");
			accountRegistrationPage.setFname(randomString());
			accountRegistrationPage.setlname(randomString());
			accountRegistrationPage.setEmail(randomString() + "@" + "gamil.com");
			accountRegistrationPage.setTelephone(randomLong());
			accountRegistrationPage.setPassword("hello@1234");
			accountRegistrationPage.setCPassword("hello@1234");
			accountRegistrationPage.clickAgree();
			accountRegistrationPage.clickContinue();
			Thread.sleep(5000);
			System.out.println(accountRegistrationPage.getAccountCreatedText());
		} catch (Exception e) {
			logger.error(e.getMessage());
			logger.debug("tests failed");
			System.out.println(e.getMessage());
		}
	}

}
