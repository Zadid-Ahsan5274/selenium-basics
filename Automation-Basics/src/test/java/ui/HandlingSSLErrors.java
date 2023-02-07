package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLErrors {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		DesiredCapabilities handleSSLError = new DesiredCapabilities();

		if (browser.equals("chrome")) {
			handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			// handleSSLError.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions coptions = new ChromeOptions();
			coptions.merge(handleSSLError);
			driver = new ChromeDriver(coptions);
		} else if (browser.equals("firefox")) {
			handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			// handleSSLError.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			FirefoxOptions ffoptions = new FirefoxOptions();
			ffoptions.merge(handleSSLError);
			driver = new FirefoxDriver(ffoptions);
		} else if (browser.equals("edge")) {
			handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			// handleSSLError.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			EdgeOptions eoptions = new EdgeOptions();
			eoptions.merge(handleSSLError);
			driver = new EdgeDriver(eoptions);
		}

		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");

	}

}
