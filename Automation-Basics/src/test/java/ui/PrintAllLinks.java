package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		// List<WebElement> allLinksTags = driver.findElements(By.tagName("a"));
		List<WebElement> allLinksTags = driver.findElements(By.tagName("option"));
		System.out.println(allLinksTags.size());
		for (int i = 0; i < allLinksTags.size(); i++) {
			System.out.println("Links on the page are: " + allLinksTags.get(i).getAttribute("value"));
			// System.out.println("Links on the page are: " +
			// allLinksTags.get(i).getText());
		}
	}
}
