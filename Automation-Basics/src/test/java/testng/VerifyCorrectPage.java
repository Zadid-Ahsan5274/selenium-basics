package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.CommonDataSetup;

public class VerifyCorrectPage extends CommonDataSetup {

	@Test
	public void titleTest() {
		SoftAssert soft_assert = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String actual_title = driver.getTitle();
		String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expected_text = "Search";
		String actual_text = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		/*
		 * if (actual_title.equals(expected_title)) { System.out.println("Passed Test");
		 * } else { System.out.println("Failed Test"); }
		 * System.out.println(actual_title);
		 */
		System.out.println("Verifying Title");
		System.out.println("Verifying Text");
		soft_assert.assertEquals(actual_title, expected_title, "Title Verification Failed");
		soft_assert.assertEquals(actual_text, expected_text, "Text Verification Failed");
		System.out.println("Quiting Browser");
		driver.quit();
		soft_assert.assertAll();
	}

}
