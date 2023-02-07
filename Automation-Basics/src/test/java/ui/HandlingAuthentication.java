package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthentication {

	public static String username = "admin";
	public static String password = "admin";

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");

	}

}
