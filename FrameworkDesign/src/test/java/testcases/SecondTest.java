package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class SecondTest extends BaseTest {

	@Test
	public void loginTest() throws InterruptedException {

		driver.get("https://www.zoho.com/crm/"); // properties
		driver.findElement(By.partialLinkText(loc.getProperty("sign_in_link"))).click(); // locators - properties
		driver.findElement(By.id(loc.getProperty("email_id"))).sendKeys("rcvtutorials@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("testautomation@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(4000);

	}
}
