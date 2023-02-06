package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		By userNameLocator = RelativeLocator.with(By.tagName("input")).above(By.id("user-name"));
		By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("password"));
		By loginBtn = RelativeLocator.with(By.tagName("input")).above(By.id("login-button"));
		// driver.findElement(userNameLocator).sendKeys("locked_out_user");
		// driver.findElement(passwordLocator).sendKeys("secret_sauce");
		driver.findElement(passwordLocator).click();
	}

}
