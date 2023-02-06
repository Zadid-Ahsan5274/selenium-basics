package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(
				By.xpath("//li[@class='hl-cat-nav__js-tab hl-cat-nav__js-show']//a[contains(text(),'Electronics')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

}
