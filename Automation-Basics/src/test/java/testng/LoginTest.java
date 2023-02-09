package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class LoginTest extends CommonDataSetup {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application");
	}

	@BeforeMethod
	public void connectToDB() {
		System.out.println("Connected to Database");
	}

	@Test(priority = 1, description = "This is a login test")
	public void aTest1() {
		System.out.println("Test 1");
	}

	@Test(priority = 2, description = "This is a logout test")
	public void aTest2() {
		System.out.println("Test 2");
	}

	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("Disconnected from Database");
	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from application");
	}

}
