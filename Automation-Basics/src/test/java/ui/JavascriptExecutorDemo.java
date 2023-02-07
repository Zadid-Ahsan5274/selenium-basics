package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Print the title of the page
		String script = "return document.title;";
		String title = (String) js.executeScript(script);
		System.out.println(title);

		// Click button
		driver.switchTo().frame("iframeResult");
		js.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		// Highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		js.executeScript("arguments[0].style.border='3px solid red'", button);

		// Close button
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiedButton = driver.findElement(By.xpath("//*[@id='certsection']/p/a"));
		js.executeScript("arguments[0].scrollIntoView(true);", certifiedButton);

	}

}
