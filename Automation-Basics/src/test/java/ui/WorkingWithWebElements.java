package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("zadid1@mailinator.com");
		driver.findElement(By.name("firstname")).sendKeys("Ahsan");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isSelected());

	}

}
