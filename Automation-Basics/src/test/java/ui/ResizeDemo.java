package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://jqueryui.com/resizable/");
		 * driver.manage().window().maximize(); WebElement frame =
		 * driver.findElement(By.xpath("//*[@id='content']/iframe"));
		 * driver.switchTo().frame(frame); WebElement element =
		 * driver.findElement(By.id("resizable")); Actions action = new Actions(driver);
		 * action.dragAndDropBy(element, 300, 100).perform();
		 */

		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		WebElement green_slider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(green_slider, 100, 125).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(green_slider, -100, 125).perform();
		Thread.sleep(2000);
	}

}
