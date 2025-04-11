package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;

public class TC002_OpenKartLogin extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_Login() {
		try {
			logger.info("********* TC002 starting login scenario ********");
			HomePage hp = new HomePage(driver);
			driver.get(p.getProperty("appUrl"));
			Thread.sleep(5000);
			hp.clickOnMyAccount();
			Thread.sleep(5000);
			hp.clickOnLogin();
			loginPage lp = new loginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.SetPassword(p.getProperty("password"));
			lp.clickLoginbutton();
			myAccountPage myaccount = new myAccountPage(driver);
			boolean targetPage = myaccount.ismyAccountPagedisplay();
			// Assert.assertEquals(targetPage, true,"Login failed");
			Thread.sleep(5000);
			//Assert.assertTrue(targetPage);
			System.out.println(targetPage);

		} catch (Exception e) {
			Assert.fail();
			System.out.println(e.getMessage());
		}
		logger.info("********* TC002 login scenario completed ********");
	}

}
