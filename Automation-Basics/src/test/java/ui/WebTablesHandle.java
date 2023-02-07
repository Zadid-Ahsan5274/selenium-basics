package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www2.asx.com.au/");

		// Step 1 - Switch to that particular frame that has that table
		// Step 2 - Get the number of rows
		// Step 3 - Get the number of columns
		// Step 4 - Iterate rows and columns and get text and print it

		WebElement frame1 = driver.findElement(By.id("announcements-frame"));
		driver.switchTo().frame(frame1);

		List<WebElement> rowElements = driver
				.findElements(By.xpath("//*[@id='announcement_data_widget']/table/tbody/tr"));
		System.out.println(rowElements.size());
		int rowSize = rowElements.size();

		List<WebElement> columnElements = driver
				.findElements(By.xpath("//*[@id='announcement_data_widget']/table/tbody/tr[1]/td"));
		System.out.println(columnElements.size());
		int colSize = columnElements.size();

		for (int i = 1; i <= rowSize; i++) {
			for (int j = 1; j <= colSize; j++) {
				System.out.println(driver
						.findElement(
								By.xpath("//*[@id='announcement_data_widget']/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText());
			}
		}
	}

}
