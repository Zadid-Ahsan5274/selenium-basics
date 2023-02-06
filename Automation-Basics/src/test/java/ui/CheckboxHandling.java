package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.id("doi0"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		driver.findElement(By.name("doi")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("doi")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}
}
