package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWebDriverMethods {

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

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		String title = driver.getTitle();
		System.out.println(title);

		String page_source = driver.getPageSource();
		System.out.println(page_source);

		WebElement user_name = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login-button']"));
		user_name.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		loginBtn.click();
		List<WebElement> list_of_items = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(list_of_items);
		driver.navigate().to("https://www.sugarcrm.com");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/nav/nav/ul/li[8]/a/span[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		driver.quit();
	}

}
