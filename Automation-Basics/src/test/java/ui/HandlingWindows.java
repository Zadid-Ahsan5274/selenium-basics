package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='Start my free trial']")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		Iterator<String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		System.out.println(parentWindow);
		String childWindow = iterator.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Academy");
		driver.switchTo().window(parentWindow);
	}

}
