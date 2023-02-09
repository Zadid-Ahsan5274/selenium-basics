package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerTest extends BaseTest {

	@Test(retryAnalyzer = common.Retry.class)
	public void launchApp() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}

}
