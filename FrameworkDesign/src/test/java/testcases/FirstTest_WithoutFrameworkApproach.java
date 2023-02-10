package testcases;

import org.openqa.selenium.By;

import base.BaseTest;

public class FirstTest_WithoutFrameworkApproach extends BaseTest {

	public static void main(String[] args) {
		driver.get("https://www.zoho.com/crm/"); // properties
		driver.findElement(By.partialLinkText("SIGN IN")).click(); // locators - properties
		driver.findElement(By.id("login_id")).sendKeys("rcvtutorials@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testautomation@123");
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();

		// driver.loginToZoho("user", "password");
	}

}
