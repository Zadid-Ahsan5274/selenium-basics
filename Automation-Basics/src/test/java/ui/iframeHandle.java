package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.sugarcrm.com/au/request-demo/");
		// driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		/*
		 * System.out.println(driver.switchTo().alert().getText()); Thread.sleep(2000);
		 * //driver.switchTo().alert().accept(); driver.switchTo().alert().dismiss();
		 */
		Alert alertOnPage = driver.switchTo().alert();
		alertOnPage.sendKeys("Ahsan zadid");
		alertOnPage.accept();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
