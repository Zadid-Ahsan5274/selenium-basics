package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TestUtils;

public class Listeners extends TestUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is " + result.getName());
		System.out.println("Test Case is starting...");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of exection is " + result.getStatus());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed - screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("<a href = \"..//screenshot/Test-Results/\"</a>");
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercantage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
