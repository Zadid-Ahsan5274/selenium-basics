package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}

}
