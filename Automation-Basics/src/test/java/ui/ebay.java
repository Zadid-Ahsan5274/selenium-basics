package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("gh-ac")).sendKeys("Mobile");
		driver.findElement(By.id("gh-btn")).click();
		driver.close();
		// driver.quit();

	}

}
