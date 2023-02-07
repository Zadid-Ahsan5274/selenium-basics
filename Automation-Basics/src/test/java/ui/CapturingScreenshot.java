package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshot {

	public static void main(String[] args) throws IOException {

		Date currentDate = new Date();
		System.out.println(currentDate);
		String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotFileName);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotFileName + ".png"));
		driver.quit();
	}

}
