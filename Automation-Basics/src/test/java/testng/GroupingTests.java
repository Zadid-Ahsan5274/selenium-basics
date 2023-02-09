package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;

//@Test(groups = "user-registration")
public class GroupingTests extends CommonDataSetup {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this before class");
	}

	@BeforeGroups(value = "Regression")
	public void beforeGroup() {
		System.out.println("Run this before group");
	}

	@AfterGroups(value = "Regression")
	public void afterGroup() {
		System.out.println("Run this after group");
	}

	@Test(groups = "Regression")
	public void aTest1() {
		System.out.println("Test 1");
	}

	@Test(groups = { "Regression", "Adhoc" })
	public void aTest2() {
		System.out.println("Test 2");
	}

	@Test(groups = "Adhoc")
	public void aTest3() {
		System.out.println("Test 3");
	}

	@Test(groups = { "Smoke", "Adhoc" })
	public void aTest4() {
		System.out.println("Test 4");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Run this after class");
	}
}
