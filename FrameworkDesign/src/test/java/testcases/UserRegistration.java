package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadExcelData;

public class UserRegistration extends BaseTest {

	@Test(dataProviderClass = ReadExcelData.class, dataProvider = "bvtData")
	public void UserRegistrationTest(String username, String password) throws InterruptedException {

		driver.get("https://www.zoho.com/crm/"); // properties
		driver.findElement(By.partialLinkText(loc.getProperty("sign_in_link"))).click(); // locators - properties
		driver.findElement(By.id(loc.getProperty("email_id"))).sendKeys(username);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(4000);

	}

	// Not needed - As we have added utility and excel
	/*
	 * @DataProvider(name = "testData") public Object[][] tData() { return new
	 * Object[][] { { "rc@gmail.com", "testautn@1546456" }, { "rc@gmail.com",
	 * "testautoddsdmation@123" }, { "rcvtudfsstorials@gmail.com",
	 * "testautomation@1264443" }, { "rcvtutorials@gmail.com", "testautomation@123"
	 * } }; }
	 */
}
