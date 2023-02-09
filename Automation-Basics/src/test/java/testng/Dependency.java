package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

	@Test
	public void userRegistration() {
		System.out.println("This is Test 1");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "userRegistration", alwaysRun = true)
	public void userSearch() {
		System.out.println("This is Test 2");
	}

	@Test
	public void reporterTest3() {
		System.out.println("This is Test 3");
	}

	@Test
	public void reporterTest4() {
		System.out.println("This is Test 4");
	}

}
