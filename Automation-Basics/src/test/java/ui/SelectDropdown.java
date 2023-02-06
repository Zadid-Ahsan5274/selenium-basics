package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Select select = new Select(driver.findElement(By.name("employees_c")));
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		select.selectByValue("level1");
		Thread.sleep(2000);
		select.selectByVisibleText("101 - 250 employees");
		Thread.sleep(2000);
		select.selectByIndex(7);
		Thread.sleep(2000);

		/*
		 * driver.get(
		 * "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); Select
		 * select = new Select(driver.findElement(By.id("multi-select")));
		 * select.selectByValue("California"); Thread.sleep(4000);
		 * select.selectByIndex(5); Thread.sleep(4000); List<WebElement> allItems =
		 * select.getAllSelectedOptions(); System.out.println(allItems.size());
		 * select.deselectAll(); Thread.sleep(4000); select.selectByValue("California");
		 * Thread.sleep(4000); select.selectByIndex(5); Thread.sleep(4000);
		 * select.deselectByIndex(5); Thread.sleep(4000); List<WebElement> allItems1 =
		 * select.getAllSelectedOptions(); System.out.println(allItems1.size());
		 */
	}

}
