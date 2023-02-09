package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class SkippingTests extends CommonDataSetup {

	boolean dataSetup = false;

	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping this test as this test is not complete");
	}

	@Test
	public void skipTest2() {
		System.out.println("Skipping this test as this test is not complete");
		throw new SkipException("Skippin this test");
	}

	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on condition");
		if (dataSetup = true) {
			System.out.println("Execute the test");
		} else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
	}

}
