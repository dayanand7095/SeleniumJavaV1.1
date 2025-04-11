package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

/*Data is valid  - login success - test pass  - logout
 					login failed - test fail

Data is invalid - login success - test fail  - logout
 					login failed - test pass
*/

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups="Datadriven") // getting data
																				// provider from
																				// different
																				// class
	public void verify_loginDDT(String email, String pwd, String exp) throws InterruptedException {
		logger.info("***** stating TC_003_LoginDDT ******");

		try {
			driver.get(p.getProperty("appUrl"));
			// HomePage
			HomePage hp = new HomePage(driver);
			hp.clickOnMyAccount();
			hp.clickOnLogin();

			// Login
			loginPage lp = new loginPage(driver);
			lp.setEmail(email);
			lp.SetPassword(pwd);
			lp.clickLoginbutton();

			// MyAccount
			myAccountPage macc = new myAccountPage(driver);
			boolean targetPage = macc.ismyAccountPagedisplay();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetPage == true) {
					macc.clickLogout();
					Assert.assertTrue(true);

				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetPage == true) {
					macc.clickLogout();
					Assert.assertTrue(false);

				} else {
					Assert.assertTrue(true);
				}
			}

		} catch (Exception e) {
			Assert.fail();
		}
		Thread.sleep(3000);
		logger.info("***** Finished TC_003_LoginDDT ******");

	}

}
